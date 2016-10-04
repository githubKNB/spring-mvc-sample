/**
 * 
 */
package com.samplemvc.dto;

/**
 * @author niranjan
 *
 */
public class PageDTO {

	public PageDTO(String pageName) {
		this.pageName = pageName;
	}
	
	private String pageName;
	private String pageMessage;
	/**
	 * @return the pageName
	 */
	public String getPageName() {
		return pageName;
	}
	/**
	 * @return the pageMessage
	 */
	public String getPageMessage() {
		return pageMessage;
	}
	/**
	 * @param pageMessage the pageMessage to set
	 */
	public void setPageMessage(String pageMessage) {
		this.pageMessage = pageMessage;
	}
}
