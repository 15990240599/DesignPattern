package creationalpattern.simplefactory;

public class CourseFactory {
    //v1
//    public ICourse craete(String name){
//        if ("java".equals(name)){
//            return new JavaCourse();
//        }else if ("python".equals(name)){
//            return new PythonCourse();
//        }else{
//            return null;
//        }
//    }

    //v2
//    public ICourse craete(String className){
//
//        try {
//             if (!StringUtils.isEmpty(className)){
//
//            }
//            return (ICourse) Class.forName(className).newInstance();
//        } catch  (Exception e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }

    //v3
    public ICourse craete(Class<? extends ICourse> clazz){

        try {
            if (clazz != null){
                 return clazz.newInstance();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }
}
