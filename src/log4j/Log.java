package log4j;

import org.apache.log4j.Logger;

import useditem.model.dto.UsedItemUploadDTO;

public class Log {
	static Logger logger = Logger.getLogger("log4j.Log");
	
	// �Ǹ�/���� �� ��� �α� ���
	public static void uploadCheck(String message, UsedItemUploadDTO usedItemUpload) {
		if(message.equals("Success")){
			logger.info("���ο� �� ����!, Log ��� �Ϸ�!\n=>" + usedItemUpload);		
		}
	}
	
	// ���� ���� ���� ���� �α� ���
	public static void itemPriceUpdateCheck(String message, String usedItemId, String usedItemPrice) {
		if(message.equals("Success")){
			logger.info("\n" + "������Ʈ �� �� ����!, Log ��� �Ϸ�!\n=>" + "'" + usedItemId + "' ������ '" + usedItemPrice
						+ "'���� ������!" + "\n");		
		}
	}
	
	// ���� �ŷ� ���� ���� ���� �α� ���
	public static void itemStatusUpdateCheck(String message, String usedItemId, String usedItemStatus) {
		if(message.equals("Success")){
			logger.info("\n" + "������Ʈ �� �� ����!, Log ��� �Ϸ�!\n" + "'" + usedItemId + "' �ŷ� ���°� '" + usedItemStatus
					+ "'���� ������!" + "\n");
		}
	}
	
}