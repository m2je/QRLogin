package com.m2je.qrlogin.service;

import java.io.OutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m2je.qrlogin.model.User;

import net.glxn.qrgen.javase.QRCode;

@Service
public class QRService {

	@Autowired
	private EncodingService encodingService;

	public void generateQRCode(User user, OutputStream outputStream) {
		QRCode.from(new String(encodingService.generateForUser(user))).writeTo(outputStream);
	}
}
