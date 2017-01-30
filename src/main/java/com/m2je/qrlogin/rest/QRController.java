package com.m2je.qrlogin.rest;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.glxn.qrgen.javase.QRCode;

@RestController
public class QRController {

	@RequestMapping(value = "/QRCode", method = RequestMethod.GET)
	public void generateQRCode(HttpServletResponse response) throws IOException {
		response.addHeader("Content-disposition", "inline;filename=somefile.jpg");
		response.setContentType("image/jpg");

		QRCode.from("Hello World").writeTo(response.getOutputStream());
		response.flushBuffer();

	}
}
