package assignmentMar14;

class Python {
	public void displayInfo() {
		System.out.println("Python Programming Language");
	}
}

class Java extends Python {
	@Override
	public void displayInfo() {
		System.out.println("Java Programming Language");
	}
}

class polymorphismEx {
	public static void main(String[] args) {
		Java j1 = new Java();
		j1.displayInfo();
		Python p1 = new Python();
		p1.displayInfo();
	}
}