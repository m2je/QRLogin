package com.m2je.qrlogin.service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.stereotype.Component;

import com.m2je.qrlogin.model.User;

@Component
public class EncodingService {

	private static MessageDigest DIGEST;

	static {

		try {
			DIGEST = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {

			throw new RuntimeException(e);
		}

	}

	public byte[] generateForUser(User user) {
		return DIGEST.digest(user.getKey().getBytes());
	}

}
