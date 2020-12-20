package blood.model;

public class BloodAdvisor {
	
	public String getAdvice(String blood){
		
		String msg=null;
		if(blood.equals("A")){
			msg="꼼꼼하고 세심하다 하지만 때론 소심하다";	
		}else if(blood.equals("B")){
			msg="고집이 쎄다, 여자는 엉뚱";
		}else if(blood.equals("O")){
			msg="사교성 있고, 둥글둥글하다 그러나 오지랖이다";
		}else if(blood.equals("AB")){
			msg="4차원이다";
		}
		return msg;
	}
}
