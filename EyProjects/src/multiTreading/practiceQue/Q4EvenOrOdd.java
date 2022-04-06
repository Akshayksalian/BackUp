package multiTreading.practiceQue;

public class Q4EvenOrOdd {
	public static void main(String[] args) {

		EvenAndOdd eao = new EvenAndOdd();
		Thread t1 = new Thread("Thread Odd:") {
			@Override
			public void run() {
				eao.odd();
			};
		};

		Thread t2 = new Thread("Thread even:") {
			@Override
			public void run() {
				eao.even();
			};
		};

		t1.start();
		t2.start();

	}

}

class EvenAndOdd {

	static int counter = 1;

	public void even() {
		synchronized (this) {
			while (counter < 20) {
				if (counter % 2 == 0) {
					try {
						wait();
					} catch (InterruptedException ie) {
						ie.getMessage();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + counter++);
				notify();
			}
		}

	}

	public void odd() {
		synchronized (this) {
			while (counter < 20) {
				if (counter % 2 != 0) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + counter++);
				notify();
			}
		}
	}

}
