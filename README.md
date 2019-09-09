# 파라미터의 getter기준으로, 기존 객체의 settet를 호출하여 

	ReflectionUtil reflectionUtil = new ReflectionUtil();
		
	Member member = new Member(1,"테스트","남","Y");
	MyPageForm myPageForm = new MyPageForm(1,"테스트2");
	
	Member result = (Member)reflectionUtil.overWriteProperties(member, myPageForm);
	
	System.out.println(result.getIdx());
	System.out.println(result.getName());
	System.out.println(result.getGender());
	System.out.println(result.getAgreeYn());


