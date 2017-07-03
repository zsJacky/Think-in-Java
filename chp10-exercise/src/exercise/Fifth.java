package exercise;

class FifthOuter {
	class FifthInner {
		private String inner = "FifthInner";
		public String getInner() {
			return inner;
		}
	}
}

public class Fifth {
	public static void main(String[] args) {
		FifthOuter fo = new FifthOuter();
		FifthOuter.FifthInner fi = fo.new FifthInner();
		System.out.println(fi.getInner());
	}
}
