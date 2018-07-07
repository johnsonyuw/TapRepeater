package com.chandler.taprepeater.services

import android.accessibilityservice.AccessibilityService
import android.util.Log
import android.view.accessibility.AccessibilityEvent

class OprationRecordService : AccessibilityService() {
  val TAG = "OprationRecordService"
  override fun onAccessibilityEvent(event: AccessibilityEvent?) {
    Log.d(TAG, "onAccessibilityEvent:" + event)
  }

  override fun onInterrupt() {
    Log.d(TAG, "onInterrupt:")
  }

}
