package com.m2je.qrlogin.rest;

import java.net.URL;

import javax.imageio.ImageIO;

import org.junit.Test;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeReader;

public class QRReaderTestIT {

	@Test
	public void test() throws Exception {
		QRCodeReader reader=new QRCodeReader();
		LuminanceSource source = new BufferedImageLuminanceSource(ImageIO.read(new URL("http://localhost:8080/QRCode")));
        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

		reader.decode(bitmap);

	}
}
