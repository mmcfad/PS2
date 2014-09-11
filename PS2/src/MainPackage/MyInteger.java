//Mark McFadden
//PS2 CISC 181


package MainPackage;


//Create a public class MyInteger that contains a data field, a constructor, a getter, and many methods.
public class MyInteger {
	
	private int value;

	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public boolean isEven() {
		return (value % 2 == 0);
	}

	public boolean isOdd() {
		return (value % 2 != 0);
	}

	public boolean isPrime() {
        if (value <= 1) {
            return false;
        }
        if (value == 2) {
            return true;
        }
        if (value % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(value) + 1; i = i + 2) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
	}
	
	public static boolean isEven(int value) {
		return (value % 2 == 0);
	}

	public static boolean isOdd(int value) {
		return (value % 2 != 0);
	}

	public static boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        }
        if (value == 2) {
            return true;
        }
        if (value % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(value) + 1; i = i + 2) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
	}
	
	
	public static boolean isEven(MyInteger MyInt) {
		return (MyInt.value % 2 == 0);
	}

	public static boolean isOdd(MyInteger MyInt) {
		return (MyInt.value % 2 != 0);
	}

	public static boolean isPrime(MyInteger MyInt) {
        if (MyInt.value <= 1) {
            return false;
        }
        if (MyInt.value == 2) {
            return true;
        }
        if (MyInt.value % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(MyInt.value) + 1; i = i + 2) {
            if (MyInt.value % i == 0) {
                return false;
            }
        }
        return true;
	}
	
	public boolean equals(int testValue){
		return value == testValue;
	}
	
	public boolean equals(MyInteger MyInt){
		return  value == MyInt;
		
	} 
	
	public static int parseInt(char[] intArray[]){
		for intArray{
			//????????????????????????????
		}
	}
	
	public static int parseInt(String intString){
		for intString{
			
		}
	}
	
}



