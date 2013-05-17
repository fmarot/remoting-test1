package com.teamtter.service;

import java.util.Arrays;

import com.teamtter.data.ImageServiceMetaData;
import com.teamtter.services.IImageService;

public class ImageService implements IImageService {

	private static final String VERSION = "1.0.0";

	public ImageServiceMetaData getServiceMetaData() {
		ImageServiceMetaData metaData = new ImageServiceMetaData();
		metaData.setServiceVersion(VERSION);
		metaData.setSupportedImageTypes(Arrays.asList(new String[]{"png", "jpg"}));
		return metaData;
	}

}
