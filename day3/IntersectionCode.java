package week1.day3;

public class IntersectionCode {

			public static void main(String[] args) {

				int[] a= {3,2,11,4,6,7};
				int[] b= {1,2,8,4,9,7};

				int len1=a.length;
				int len2=a.length;

				System.out.println("the numbers present in both first array and second array ");

				for(int i=0; i<len1;i++) {

					for(int j=0; j<len2;j++) {

						if(a[i]==b[j]) {
							System.out.println(a[i]);
						}
					}
				}
			}

	}

