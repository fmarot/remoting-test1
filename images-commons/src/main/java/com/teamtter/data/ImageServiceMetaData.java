package com.teamtter.data;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class ImageServiceMetaData {
	@Getter @Setter
	private String serviceVersion;
	@Getter @Setter
	private List<String> supportedImageTypes;
}
