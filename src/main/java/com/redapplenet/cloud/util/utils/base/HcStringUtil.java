package com.redapplenet.cloud.util.utils.base;


import org.apache.commons.lang3.StringUtils;

import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.List;


/**
 * huicent的字符串帮助类
 * @author donglong
 */
public class HcStringUtil {
	
	/**
	 * 将数组合并成带分隔符的字符串(中间以逗号隔开)
	 * @param strs			:	待合并的字符串数组
	 * @return
	 */
	public static String unite(String[] strs) {
		return unite(strs, ",");
	}

	/**
	 * 将数组合并成带指定分隔符的字符串
	 * @param strs			:	待合并的字符串数组
	 * @param strSeparator	：	分隔符
	 * @return
	 */
	public static String unite(String[] strs, String strSeparator) {
		if(strs==null || strs.length==0 
				|| strSeparator==null || strSeparator.length()==0 ) return "";
		String str = "";
		for(int i=0;i<strs.length;i++){
			if(strs[i].trim().length()==0) continue;
			str+=strSeparator+strs[i];
		}
		if(str.length()>1)
			return str.substring(strSeparator.length());
		else 
			return str;
	}
	
	/**
	 * 将对象的所有属性合并成字符串输出，分隔符为;
	 * @param component
	 * @return
	 */
	public static String toString(Object obj) {
		try {
			PropertyDescriptor[] props = Introspector.getBeanInfo(obj.getClass()).getPropertyDescriptors();
			StringBuilder builder = new StringBuilder();
			for (PropertyDescriptor descriptor : props) {
				builder.append(descriptor.getName()).append("=").append(
						descriptor.getReadMethod().invoke(obj)).append("; ");
			}
			return builder.toString();
		} catch (Exception e) {
			return "";
		}
	}

	/**
	 * 将多个object合并成字符串，分隔符为" "
	 * @param objects
	 * @return
	 */
	public static String toString(Object... objects) {
		return toString(" ", objects);
	}

	/**
	 * 将多个object合并成字符串
	 * @param strSeparator	：	分隔符
	 * @param objects
	 * @return
	 */
	public static String toString(String sep, Object... objects) {
		if (objects.length == 0)
			return "";
		StringBuilder builder = new StringBuilder();
		for (Object object : objects) {
			builder.append(sep).append(object);
		}
		return builder.substring(2);
	}

	/**
	 * 将多个object的类名合并成字符串
	 * @param strSeparator	：	分隔符
	 * @param objects
	 * @return
	 */
	public static String toClassNameString(String strSeparator, Object... objects) {
		if (objects.length == 0)
			return "";
		StringBuilder builder = new StringBuilder();
		for (Object object : objects) {
			builder.append(strSeparator);
			if (object == null) {
				builder.append("null");
			} else {
				builder.append(object.getClass().getName());
			}
		}
		return builder.substring(2);
	}


	/**
	 * 将字符串的首字母大写
	 * @param msg
	 * @return
	 */
	public static String capfirstChar(String str) {
		char[] msgs = str.toCharArray();
		msgs[0] = (char) (msgs[0] - 32);
		return String.valueOf(msgs);
	}

	/**
	 * 判断字符串是否是空字符串
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		return StringUtils.isEmpty(str);
	}

	/**
	 * 判断字符串是否是空字符串,如果是，则返回空（是空不是null）；否则返回字符串的值
	 * @param str
	 * @return
	 */
	public static String checkNull(String str) {
		if (str==null){
			return "";
		}
		return str;
	}
	
	public static String idstoInStr(String ids) {
		String[] split = ids.split(",");
		String result = "";
		for(int i = 0;i<split.length;i++){
			if(i==0){
				result = result + "'"+split[0]+"'";
			}else{
				result = result + ",'"+split[i]+"'";
			}
		}
		return result;
	}

	public static String changeFfpReason(String msg) {
		if (msg.indexOf("-")>-1)
			msg = msg.split("-")[1];
		if (msg.equals("您尚未设置邮寄地址或设置了多个邮寄地址"))
			msg = "只能设置1个默认邮寄地址";
		if (msg.equals("您的手机号已注册超过5个的会员，不能再注册！"))
			msg = "该手机号已超过最多注册数量限制，请更换!";
		if (msg.indexOf("已经存在") > -1)
			msg = "该证件号已注册！";
		if (msg.indexOf("户名或卡号错误") > -1)
			msg = "该证件号未注册，请重新输入!";
		if (msg.indexOf("格式不正确") > -1)
			msg = "您的信息不正确，请重新输入!";
		return msg;
	}

	/**
	 * splitAry方法<br>
	 * @param ary 要分割的数组
	 * @param subSize 分割的块大小
	 * @return
	 *
	 */
	public static Object[] splitAry(byte[] ary, int subSize) {
		int count = ary.length % subSize == 0 ? ary.length / subSize: ary.length / subSize + 1;
		List<List<Byte>> subAryList = new ArrayList<List<Byte>>();
		for (int i = 0; i < count; i++) {
			int index = i * subSize;
			List<Byte> list = new ArrayList<Byte>();
			int j = 0;
			while (j < subSize && index < ary.length) {
				list.add(ary[index++]);
				j++;
			}
			subAryList.add(list);
		}
		Object[] subAry = new Object[subAryList.size()];
		for(int i = 0; i < subAryList.size(); i++){
			List<Byte> subList = subAryList.get(i);
			byte[] subAryItem = new byte[subList.size()];
			for(int j = 0; j < subList.size(); j++){
				subAryItem[j] = subList.get(j);
			}
			subAry[i] = subAryItem;
		}
		return subAry;
	}

}
