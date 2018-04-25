
public class Monitor implements ElectronicDevice {
		
		TheQueue q1 = new TheQueue(10);
		
		private int volume = 0;

		@Override
		public void insert(Node n) {
			// TODO Auto-generated method stub
			q1.insert(n);
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			q1.remove();
		}

		@Override
		public void peek() {
			// TODO Auto-generated method stub
			q1.peek();
		}

		@Override
		public void on() {
			// TODO Auto-generated method stub
			System.out.println("The monitor is now on");
			
		}

		@Override
		public void off() {
			// TODO Auto-generated method stub
			System.out.println("The monitor is now off");
		}

		@Override
		public void volumeUp() {
			// TODO Auto-generated method stub
			volume++;
		}

		@Override
		public void volumeDown() {
			// TODO Auto-generated method stub
			volume--;
		}
		

}
