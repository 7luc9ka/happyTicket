package happyTicket;

public class Main {
	public static void main(String[] args){
  		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Введите количество цифр билета: ");
		int l = Integer.valueOf(reader.readLine());
	
		Long started = System.currentTimeMillis();
		int l2 = l / 2;
		int max = -1;
		int[] now = new int[l];
		for(int i = 0; i < l; i++){
			now[i] = 0;
		}
		int happy = 0;
		while(true){
			max++;
			int left = 0;
			int right = 0;
			for(int i = 0; i < l2; i++){
				left += now[i];
			}
			for(int i = l2; i < l; i++){
				right += now[i];
			}
			if(left == right){
				happy++;
			}
			for(int i = l - 1; i >= 0; i--){
				now[i]++;
				if(now[i] > 9){
					if(i == 0){
						System.out.println("Вероятность счастливого билета: " + ((happy * 100.0) / max) + "%");
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
