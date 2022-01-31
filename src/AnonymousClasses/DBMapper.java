/**
* Date Created: Nov 25, 2021 10:33:53 AM
* Created by: Louie John E. Leona
*/
package AnonymousClasses;

public class DBMapper {

	/*
	 * Execute the query below and change String columns value. Remove comma on last index
	 * SELECT concat(COLUMN_NAME,',') as [text()] FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = 'CHANGE THIS' order by table_name for xml path('')
	 */
	public static String columns = "BATCH_REF_NO,SEQ_NO,STATUS,CAC,SYSTEM_CODE,DOBS_PROD_CODE,OLD_ACCOUNT_NO,OLD_ACCOUNT_STATUS,APPLICATION_NO,PROCESS_DATE,CUSTOMER_ID,FIRST_NAME,MIDDLE_NAME,LAST_NAME,NAME,BIRTHDATE,BIRTHPLACE,NATIONALITY,GENDER,CIVIL_STATUS,MOTHER_MDN_NAME,PS_NO_STREET,PS_ADDR_LN_1,PS_ADDR_LN_2,PS_CITY,PS_CITY_DESC,PS_PROVINCE,PS_PROVINCE_DESC,PS_COUNTRY,PS_COUNTRY_DESC,PS_ZIP_CODE,PM_NO_STREET,PM_ADDR_LN_1,PM_ADDR_LN_2,PM_CITY,PM_CITY_DESC,PM_PROVINCE,PM_PROVINCE_DESC,PM_COUNTRY,PM_COUNTRY_DESC,PM_ZIP_CODE,EMAIL_ADDRESS,MOBILE_NO_1,TIN,OCCUPATION,FUND_SOURCE_1,MONTHLY_GROSS_INC,ANNUAL_GROSS_INC,EMPLOYER_NAME,EMPLOYER_START_DATE,EMPLOYER_ADDRESS,EMPLOYER_PROVINCE,EMPLOYER_COUNTRY,JOB_TITLE,ID_TYPE,ID_NO,ID_TYPE2,ID_NO2,EMBOSS_NAME,MOBILE_BANKING_ID,EXP_MONTH_DEPOSIT,EXP_MONTH_DEPOSIT_FREQ,AC_OPEN_PURPOSE,INPUT_DATE,ACCOUNT_NO,DATE_OPENED,BRANCH_CODE,REF_APP_NO";
	public final static String POJO_STRING_VAR = "private String %s;\n";
	public final static String RESULT_MAP = "<result column=\"%s\" property=\"%s\"/>\n";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] columnsArr = columns.split(",");
		generateVariables(columnsArr);
		generateResultMap(columnsArr);
	}
	
	/**
	 * Generates string variables for POJO
	 * Adjust data type if necessary
	 */
	public static void generateVariables(String[] columnsArr){

		for(String col : columnsArr){
			System.out.printf(POJO_STRING_VAR, changeToCamelCase(col));
		}
	}
	
	/*
	 * Generates result map to be used on xml
	 */
	public static void generateResultMap(String[] columnsArr){		

		for(String col : columnsArr){
			System.out.printf(RESULT_MAP, col, changeToCamelCase(col));
		}
	}
	
	private static String changeToCamelCase(String str){
		String[] strArr = str.toLowerCase().split("_");
		StringBuilder sb = new StringBuilder();
		sb.append(strArr[0]);
		for(int x = 1 ; x < strArr.length ; x++){
			String word = strArr[x];
			sb.append(Character.toUpperCase(word.charAt(0)));
			sb.append(word.substring(1));
		}
		return sb.toString();
	}

}
