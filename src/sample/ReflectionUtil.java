package sample;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtil {

	final String GETTER_PREFIX = "GET";
	final String SETTER_PREFIX = "SET";
	
	public Object overWriteProperties(Object originObj, Object newObj) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Class newObjClass = newObj.getClass();

		Field[] newObjFiledsArr = newObjClass.getDeclaredFields();

		Method[] newObjMethodArr = newObjClass.getMethods();

		for (Field tempField : newObjFiledsArr) {
			for (Method tempMethod : newObjMethodArr) {
				String methodNm = tempMethod.getName().toUpperCase();
				String fieldNm = tempField.getName().toUpperCase();

				if (methodNm.equals(GETTER_PREFIX + fieldNm)) {
					this.callSetters(fieldNm, originObj, tempMethod.invoke(newObj));
				}
			}
		}

		return originObj;
	}

	private void callSetters(String targetFieldNm, Object originObj, Object value) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Class originObjClass = originObj.getClass();

		Method[] originObjMethodArr = originObjClass.getMethods();

		for (Method tempMethod : originObjMethodArr) {
			
			String methodNm = tempMethod.getName().toUpperCase();

			if (methodNm.equals(SETTER_PREFIX + targetFieldNm)) {
				tempMethod.invoke(originObj, value);
			}
		}
		
	}
}
