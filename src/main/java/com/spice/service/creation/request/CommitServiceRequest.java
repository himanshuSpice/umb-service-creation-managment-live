package com.spice.service.creation.request;

import lombok.Data;

@Data
public class CommitServiceRequest {
	private String versionType;
	private String serviceId;
	private String remarks;
}
