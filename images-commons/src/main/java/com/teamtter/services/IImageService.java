package com.teamtter.services;

import com.teamtter.data.ImageServiceMetaData;

public interface IImageService {

	// in a real app it should not be defined here !
	public static final String	DEFAULT_CONTEXT_ROOT	= "/remoting/" + IImageService.class.getName();
	// in a real app it should not be defined here !
	public static final int		SERVICE_PORT			= 8090;

	public ImageServiceMetaData getServiceMetaData();
}
