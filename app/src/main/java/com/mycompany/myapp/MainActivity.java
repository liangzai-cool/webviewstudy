package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.webkit.*;

public class MainActivity extends Activity 
{
	private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		mWebView = (WebView) findViewById(R.id.webview);
		mWebView.setWebViewClient(new WebViewClient(){

				@Override
				public boolean shouldOverrideUrlLoading(WebView view, String url)
				{
					// TODO Auto-generated method stub
					view.loadUrl(url);
					return true;
				}
			});
		WebSettings setting=mWebView.getSettings();
		//setting.setPluginState(PluginState.ON);
		setting.setJavaScriptEnabled(true);
		String url="https://www.hao123.com/index.html";
		mWebView.loadUrl(url);
    }
}
