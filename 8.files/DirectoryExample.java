import java.io.File;

class DirectoryExample {
	public static void main(String[] args) {
		String dd = "/";
		File f = new File(dd);
		if (f.isDirectory()) {
			System.out.println("Directory of:" + dd);
			String s[] = f.list();
			for (int i = 0; i < s.length; i++) {
				File f1 = new File(dd + "/" + s[i]);
				if (f1.isDirectory()) {
					System.out.println(s[i] + " is directory");
				} else {
					System.out.println(s[i] + " is not in a directory");
				}
			}
		} else {
			System.out.println(dd + "is not in a directory");
		}
	}
}
