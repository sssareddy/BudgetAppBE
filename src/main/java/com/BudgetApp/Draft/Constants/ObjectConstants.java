package com.BudgetApp.Draft.Constants;

import java.util.Collections;
import java.util.List;

import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.sheets.v4.SheetsScopes;

public class ObjectConstants {
	public static final JsonFactory JSON_FACTORY = GsonFactory.getDefaultInstance();
	public static final String TOKENS_DIRECTORY_PATH = "tokens";
	public static final List<String> SCOPES = Collections.singletonList(SheetsScopes.SPREADSHEETS_READONLY);
	public static final String CREDENTIALS_FILE_PATH = "src/main/resources/config.properties";
	public static final String APPLICATION_NAME = "Spring Boot Budget App";
	public static final String spreadsheetId = "1s-4f_7plTvDmdPxIIi5H99edv_fQleL22aYpgGPpSws";
	public static final String spreadsheetId_Perticuler="1N8fkHKJ-Qr84Qwpqt2dMs7iM6J-EQB_9KVRe63G_tA8";
	public static final String range = "A:F";
	public static final String readRange="June!A:F";
	public static final String readRangePerticular="A";
	public static final String readDataRange="June!A2:G";
	public static final String DataInsertOption="INSERT_ROWS";
	public static final String valueInputOption="RAW";
	public static final String itemSuccessResponse="Item Added Successfully";
	public static final String dataPattren="dd/MMM/yyyy";
	public static final String access_token_string="access_token";
	public static final String TOKEN_URI="https://oauth2.googleapis.com/token?client_secret=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&grant_type=refresh_token&refresh_token=1//04gBnFGRjRDU6CgYIARAAGAQSNwF-L9Irpb3ccPv6yq-R0bcBoI7JaCxgiEcs2BrFNK4NuE24feet3FbD0Cd7PN2cpjGMmRS9Hs0&client_id=516952147863-1t8o644id53n7vsiblmtcbm9lb7s1f7v.apps.googleusercontent.com";
	public static final String VALIDATE_TOKEN_URI="https://www.googleapis.com/oauth2/v1/tokeninfo?access_token=";
	public static final String VALIDATE_TOKEN_ERROR="Error occurred while checking the access token validity: ";
	public static final String CONTENT_TYPE="Content-Type";
	
}
