package happyTicket;

public class Main {
	public static void main(String[] args){
  	  Long started = System.currentTimeMillis();
		int[] now = new int[10];
		now[0] = 0;
		now[1] = 0;
		now[2] = 0;
		now[3] = 0;
		now[4] = 0;
		now[5] = 0;
		now[6] = 0;
		now[7] = 0;
		now[8] = 0;
		now[9] = 0;
		int happy = 0;
		while(true){
			if((now[0] + now[1] + now[2] + now[3] + now[4]) == (now[5] + now[6] + now[7] + now[8] + now[9])){
				happy++;
			}
			for(int i = 9; i >= 0; i--){
				now[i]++;
				if(now[i] > 9){
					if(i == 0){
						System.out.println("Вероятность счастливого билета: " + ((happy * 100.0) / 9999999999L) + "%");
						System.out.println("Всего счастливых билетов: " + happy);
						System.out.println("Время выполнения: " + (System.currentTimeMillis() - started) + "ms");
						return;
					}
					now[i] = 0;
				}else{
					break;
				}
			}
		}
	}
}
