package com.sixin.speex;

/**
 * Speex音频播放完成监听
 * @author shidongxue
 *
 */
public interface OnSpeexCompletionListener {
    void onCompletion(SpeexDecoder speexfiledecoder);
    void onError(Exception ex);
}
