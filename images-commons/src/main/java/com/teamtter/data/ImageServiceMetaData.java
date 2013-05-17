package com.teamtter.data;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class ImageServiceMetaData implements Serializable {
	@Getter @Setter
	private String serviceVersion;
	@Getter @Setter
	private List<String> supportedImageTypes;
}
