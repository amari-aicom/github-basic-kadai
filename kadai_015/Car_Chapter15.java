package kadai_015;

	 

	public class Car_Chapter15 {
		private int gear = 1;
		private int speed = 10;
		
		public Car_Chapter15(int gear, int speed) {
			this.gear = gear;
			this.speed = speed;
		}
		
		public void gearChange(int afterGear) {
			this.gear = afterGear;
			switch(afterGear) {
			case 1 -> speed = 10;
			case 2 -> speed = 20;
			case 3 -> speed = 30;
			case 4 -> speed = 40;
			case 5 -> speed = 50;
			default -> speed = 10;
			}
			System.out.println("ギア1から" + afterGear + "に切り替えました");
			
		}
		
		public void run() {
			System.out.println("速度は時速" + this.speed + "km");
		}
	}

