package blood.model;

public class BloodAdvisor {
	
	public String getAdvice(String blood){
		
		String msg=null;
		if(blood.equals("A")){
			msg="�Ĳ��ϰ� �����ϴ� ������ ���� �ҽ��ϴ�";	
		}else if(blood.equals("B")){
			msg="������ ���, ���ڴ� ����";
		}else if(blood.equals("O")){
			msg="�米�� �ְ�, �ձ۵ձ��ϴ� �׷��� �������̴�";
		}else if(blood.equals("AB")){
			msg="4�����̴�";
		}
		return msg;
	}
}
