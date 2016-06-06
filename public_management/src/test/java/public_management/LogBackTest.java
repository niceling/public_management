/**   
* @Title: LogBackTest.java 
* @Package public_management 
* @author niceling
* @date 2016年6月3日 下午5:42:32 
* @version V1.0   
*/
package public_management;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**   
* @Package public_management 
* @author niceling
* @date 2016年6月3日 下午5:42:32   
*/

public class LogBackTest {
	private static Logger logger =LoggerFactory.getLogger(LogBackTest.class.getName());
	public static void main(String[] args) {
		logger.info("aa111111");
	}
}
