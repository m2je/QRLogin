package com.m2je.qrlogin.rest;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.m2je.qrlogin.model.User;
import com.m2je.qrlogin.service.QRService;

@RestController
public class QRController {

	@Autowired
	private QRService qRService;

	@RequestMapping(value = "/QRCode", method = RequestMethod.GET)
	public void generateQRCode(HttpSession session, HttpServletResponse response) throws IOException {
		response.addHeader("Content-disposition", "inline;filename=somefile.jpg");
		response.setContentType("image/jpg");

		qRService.generateQRCode(new User(session.getId()), response.getOutputStream());
		response.flushBuffer();

	}
}
