package com.m2je.qrlogin.generator;

import java.io.File;

import org.junit.Test;

import net.glxn.qrgen.core.image.ImageType;
import net.glxn.qrgen.javase.QRCode;

public class QRGeneratorTest {

	@Test
	public void testQRGeneration(){
		File f=QRCode.from("Hello World").to(ImageType.JPG).file();
		System.out.println(f);
	}
}
