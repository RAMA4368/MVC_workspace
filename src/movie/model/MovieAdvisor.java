package movie.model;

public class MovieAdvisor {

	public String getAdvice(String movie) {
		
		String msg=null;
		if(movie.equals("신세계")) {
			msg="황정민 : 드루와 드루와이씨";
		}else if(movie.equals("도둑들")) {
			msg="전지현 : 미친년입니다";
		}else if(movie.equals("범죄도시")) {
			msg="장첸 : 니 내 눈지아니?";
		}else if(movie.equals("다만악에서구하소서")) {
			msg="레이 : 꼭 그래야만 하냐는거야";
		}
		return msg;
	}
	
}
