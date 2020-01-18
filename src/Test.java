import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.util.Random;
import java.util.SortedSet;

/**
 * @Authror 卫骏
 * @Date 2019/12/27 12:39
 */
public class Test {
    public static void main(String[] args) throws NoSuchAlgorithmException, ParseException {
//        KeyGenerator kg = KeyGenerator.getInstance("AES");
//        kg.init(192);
//        //要生成多少位，只需要修改这里即可128, 192或256
//        SecretKey sk = kg.generateKey();
//        byte[] b = sk.getEncoded();
//        String s = byteToHexString(b);
//        System.out.println(s);

//        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
//        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate);
//        System.out.println(System.currentTimeMillis());
//        LocalDateTime parse = LocalDateTime.parse("2013-02-02", dtf2);
//        System.out.println(parse);

        //获取时间
//        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//        java.util.Date date = df.parse("2019-10-01");
//        Calendar cal = Calendar.getInstance();
//        cal.setTime(date);
//        long timestamp = cal.getTimeInMillis();
//        System.out.println(timestamp);

//        List<String> list = new ArrayList<>();
//        list.add("001");
//        list.add("005");
//        list.add("003");
//        list.add("002");
//        list.add("004");
//        SortedSet<String> sorted = new TreeSet();
//        for(String l:list){
//            sorted.add(l);
//        }
//
//        SortedSet<String> set =  sorted.headSet("004");
//
//        if(!set.isEmpty()){
//            String last = set.last();
//            System.out.println("经过headSet和last方法后->last="+last);
//        }

//        短信验证
//                HashMap<String, Object> result = null;
//                CCPRestSDK restAPI = new CCPRestSDK();
//                restAPI.init("app.cloopen.com", "8883");
//                // 初始化服务器地址和端口，生产环境配置成app.cloopen.com，端口是8883.
//                restAPI.setAccount("8a216da86f17653b016f56205c862a47", "89904b5e50344b329ca5cc379f34d275");
//                // 初始化主账号名称和主账号令牌，登陆云通讯网站后，可在控制首页中看到开发者主账号ACCOUNT SID和主账号令牌AUTH TOKEN。
//                restAPI.setAppId("8a216da86f17653b016f56205cea2a4d");
//                // 请使用管理控制台中已创建应用的APPID。
//                result = restAPI.sendTemplateSMS("13303887203","1" ,new String[]{"9527","2"});
//                System.out.println("SDKTestGetSubAccounts result=" + result);
//                if("000000".equals(result.get("statusCode"))){
//                    //正常返回输出data包体信息（map）
//                    HashMap<String,Object> data = (HashMap<String, Object>) result.get("data");
//                    Set<String> keySet = data.keySet();
//                    for(String key:keySet){
//                        Object object = data.get(key);
//                        System.out.println(key +" = "+object);
//                    }
//                }else{
//                    //异常返回输出错误码和错误信息
//                    System.out.println("错误码=" + result.get("statusCode") +" 错误信息= "+result.get("statusMsg"));
//                }

        String str = "0123456789";
        StringBuilder sb = new StringBuilder(4);
        for(int i = 0 ; i < 4 ; i++){
            char ch = str.charAt(new Random().nextInt(str.length()));
            sb.append(ch);
        }
        System.out.println(sb.toString());

        //百度识别


//    public static String byteToHexString(byte[] bytes) {
//        StringBuffer sb = new StringBuffer();
//        for (int i = 0; i < bytes.length; i++) {
//            String strHex=Integer.toHexString(bytes[i]);
//            if(strHex.length() > 3) {
//                sb.append(strHex.substring(6));
//            } else {
//                if(strHex.length() < 2) {
//                    sb.append("0" + strHex);
//                } else {
//                    sb.append(strHex);
//                }
//            }
//        }
//        return sb.toString();
//    }
//}
//        List<Integer> list = new ArrayList<>();
//        list.add(3);
//        list.add(2);
//        list.add(1);
//        list.add(4);
//        SortedSet<Integer> sortedSet = new TreeSet<Integer>(list);
//        for (Integer integer : sortedSet) {
//            System.out.println(integer);
//        }
//        System.out.println("获取3的上一个元素");
//        Integer pre = getPre(sortedSet, 3);
//        System.out.println(pre);
    }

    /**
     * 获取集合中某个元素的上一个元素
     * @param set
     * @param t
     * @param <T>
     * @return
     */
    public static <T> T getPre(SortedSet<T> set,T t){
        SortedSet<T> ts = set.headSet(t);
        if(!ts.isEmpty()){
            return ts.last();
        }
        return null;
    }
}