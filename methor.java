***
method over riding
output:
the rate of interests of sbi is:9
the rate of interests of axis is:8
the rate of interests of hdfc is:7
***
class bank{
	    int getRateofinterest() {
	      return 0;
	}
}
class sbi extends bank{
    @Override
    int getRateofinterest() {
    	return 9;
    }
        
}

	class axis extends bank{
	    @Override
	    int getRateofinterest() {
	    	return 8;
	    }
	        
	}
	class hdfc extends bank{
	    @Override
	    int getRateofinterest() {
	    	return 7;
	    }
	        
	}

	public class meth{
	    public static void main(String[] args) {
	       sbi b1=new sbi();
	       axis b2=new axis();
	       hdfc b3=new hdfc();
	       System.out.println("the rate of interests of sbi is:"+b1.getRateofinterest());
	       System.out.println("the rate of interests of axis is:"+b2.getRateofinterest());
	       System.out.println("the rate of interests of hdfc is:"+b3.getRateofinterest());
	    }
	}

***
