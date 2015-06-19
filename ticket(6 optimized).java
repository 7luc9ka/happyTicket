package happyTicket;

public class Main {
	public static void main(String[] args){
  	Long started = System.currentTimeMillis();
		int[] now = new int[6];
		now[0] = 0;
		now[1] = 0;
		now[2] = 0;
		now[3] = 0;
		now[4] = 0;
		now[5] = 0;
		int happy = 0;
		while(true){
			if((now[0] + now[1] + now[2]) == (now[3] + now[4] + now[5])){
				happy++;
			}
			for(int i = 5; i >= 0; i--){
				now[i]++;
				if(now[i] > 9){
					if(i == 0){
						System.out.println("Вероятность счастливого билета: " + ((happy * 100) / 999999.0) + "%");
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
