package com.perficient.pojo;

import java.util.Date;
import java.util.List;

public class Blog {
	private String title;
	private String content;
	private Date submitDate;
	private List<String> comments;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getSubmitDate() {
		return submitDate;
	}
	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}
	public List<String> getComments() {
		return comments;
	}
	public void setComments(List<String> comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "Blog [title=" + title + ", content=" + content + ", submitDate=" + submitDate + ", comments=" + comments
				+ "]";
	}
}
