# ReflectionUtil

ReflectionUtil reflectionUtil = new ReflectionUtil();
		
Member member = new Member(1,"테스트","남","Y");
MyPageForm myPageForm = new MyPageForm(1,"테스트2");

Member result = (Member)reflectionUtil.overWriteProperties(member, myPageForm);

System.out.println(result.getIdx());
System.out.println(result.getName());
System.out.println(result.getGender());
System.out.println(result.getAgreeYn());

파라미터에서 기존 객체에서 변경된 프로퍼티만 변경
