package movie.model;

public class MovieAdvisor {

	public String getAdvice(String movie) {
		
		String msg=null;
		if(movie.equals("�ż���")) {
			msg="Ȳ���� : ���� �����̾�";
		}else if(movie.equals("���ϵ�")) {
			msg="������ : ��ģ���Դϴ�";
		}else if(movie.equals("���˵���")) {
			msg="��þ : �� �� �����ƴ�?";
		}else if(movie.equals("�ٸ��ǿ������ϼҼ�")) {
			msg="���� : �� �׷��߸� �ϳĴ°ž�";
		}
		return msg;
	}
	
}
