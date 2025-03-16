package com.google.mediapipe.examples.facedetection;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 >2\u00020\u0001:\u0003>?@B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\u0006\u0010!\u001a\u00020\"J\u0018\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0007J\u0010\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+J\u000e\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020.J\u0018\u0010/\u001a\u0004\u0018\u00010)2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\'J\u0006\u00103\u001a\u000204J\u0014\u00105\u001a\u00020\"2\n\u00106\u001a\u000607j\u0002`8H\u0002J\u0018\u00109\u001a\u00020\"2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020%H\u0002J\u0006\u0010=\u001a\u00020\"R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006A"}, d2 = {"Lcom/google/mediapipe/examples/facedetection/FaceDetectorHelper;", "", "threshold", "", "currentDelegate", "", "runningMode", "Lcom/google/mediapipe/tasks/vision/core/RunningMode;", "context", "Landroid/content/Context;", "faceDetectorListener", "Lcom/google/mediapipe/examples/facedetection/FaceDetectorHelper$DetectorListener;", "(FILcom/google/mediapipe/tasks/vision/core/RunningMode;Landroid/content/Context;Lcom/google/mediapipe/examples/facedetection/FaceDetectorHelper$DetectorListener;)V", "getContext", "()Landroid/content/Context;", "getCurrentDelegate", "()I", "setCurrentDelegate", "(I)V", "faceDetector", "Lcom/google/mediapipe/tasks/vision/facedetector/FaceDetector;", "getFaceDetectorListener", "()Lcom/google/mediapipe/examples/facedetection/FaceDetectorHelper$DetectorListener;", "setFaceDetectorListener", "(Lcom/google/mediapipe/examples/facedetection/FaceDetectorHelper$DetectorListener;)V", "getRunningMode", "()Lcom/google/mediapipe/tasks/vision/core/RunningMode;", "setRunningMode", "(Lcom/google/mediapipe/tasks/vision/core/RunningMode;)V", "getThreshold", "()F", "setThreshold", "(F)V", "clearFaceDetector", "", "detectAsync", "mpImage", "Lcom/google/mediapipe/framework/image/MPImage;", "frameTime", "", "detectImage", "Lcom/google/mediapipe/examples/facedetection/FaceDetectorHelper$ResultBundle;", "image", "Landroid/graphics/Bitmap;", "detectLivestreamFrame", "imageProxy", "Landroidx/camera/core/ImageProxy;", "detectVideoFile", "videoUri", "Landroid/net/Uri;", "inferenceIntervalMs", "isClosed", "", "returnLivestreamError", "error", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "returnLivestreamResult", "result", "Lcom/google/mediapipe/tasks/vision/facedetector/FaceDetectorResult;", "input", "setupFaceDetector", "Companion", "DetectorListener", "ResultBundle", "app_debug"})
public final class FaceDetectorHelper {
    private float threshold;
    private int currentDelegate;
    @org.jetbrains.annotations.NotNull()
    private com.google.mediapipe.tasks.vision.core.RunningMode runningMode;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.Nullable()
    private com.google.mediapipe.examples.facedetection.FaceDetectorHelper.DetectorListener faceDetectorListener;
    @org.jetbrains.annotations.Nullable()
    private com.google.mediapipe.tasks.vision.facedetector.FaceDetector faceDetector;
    public static final int DELEGATE_CPU = 0;
    public static final int DELEGATE_GPU = 1;
    public static final float THRESHOLD_DEFAULT = 0.5F;
    public static final int OTHER_ERROR = 0;
    public static final int GPU_ERROR = 1;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "FaceDetectorHelper";
    @org.jetbrains.annotations.NotNull()
    public static final com.google.mediapipe.examples.facedetection.FaceDetectorHelper.Companion Companion = null;
    
    public FaceDetectorHelper(float threshold, int currentDelegate, @org.jetbrains.annotations.NotNull()
    com.google.mediapipe.tasks.vision.core.RunningMode runningMode, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    com.google.mediapipe.examples.facedetection.FaceDetectorHelper.DetectorListener faceDetectorListener) {
        super();
    }
    
    public final float getThreshold() {
        return 0.0F;
    }
    
    public final void setThreshold(float p0) {
    }
    
    public final int getCurrentDelegate() {
        return 0;
    }
    
    public final void setCurrentDelegate(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.mediapipe.tasks.vision.core.RunningMode getRunningMode() {
        return null;
    }
    
    public final void setRunningMode(@org.jetbrains.annotations.NotNull()
    com.google.mediapipe.tasks.vision.core.RunningMode p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.mediapipe.examples.facedetection.FaceDetectorHelper.DetectorListener getFaceDetectorListener() {
        return null;
    }
    
    public final void setFaceDetectorListener(@org.jetbrains.annotations.Nullable()
    com.google.mediapipe.examples.facedetection.FaceDetectorHelper.DetectorListener p0) {
    }
    
    public final void clearFaceDetector() {
    }
    
    public final void setupFaceDetector() {
    }
    
    public final boolean isClosed() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.mediapipe.examples.facedetection.FaceDetectorHelper.ResultBundle detectVideoFile(@org.jetbrains.annotations.NotNull()
    android.net.Uri videoUri, long inferenceIntervalMs) {
        return null;
    }
    
    public final void detectLivestreamFrame(@org.jetbrains.annotations.NotNull()
    androidx.camera.core.ImageProxy imageProxy) {
    }
    
    @androidx.annotation.VisibleForTesting()
    public final void detectAsync(@org.jetbrains.annotations.NotNull()
    com.google.mediapipe.framework.image.MPImage mpImage, long frameTime) {
    }
    
    private final void returnLivestreamResult(com.google.mediapipe.tasks.vision.facedetector.FaceDetectorResult result, com.google.mediapipe.framework.image.MPImage input) {
    }
    
    private final void returnLivestreamError(java.lang.RuntimeException error) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.mediapipe.examples.facedetection.FaceDetectorHelper.ResultBundle detectImage(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap image) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/google/mediapipe/examples/facedetection/FaceDetectorHelper$Companion;", "", "()V", "DELEGATE_CPU", "", "DELEGATE_GPU", "GPU_ERROR", "OTHER_ERROR", "TAG", "", "THRESHOLD_DEFAULT", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/google/mediapipe/examples/facedetection/FaceDetectorHelper$DetectorListener;", "", "onError", "", "error", "", "errorCode", "", "onResults", "resultBundle", "Lcom/google/mediapipe/examples/facedetection/FaceDetectorHelper$ResultBundle;", "app_debug"})
    public static abstract interface DetectorListener {
        
        public abstract void onError(@org.jetbrains.annotations.NotNull()
        java.lang.String error, int errorCode);
        
        public abstract void onResults(@org.jetbrains.annotations.NotNull()
        com.google.mediapipe.examples.facedetection.FaceDetectorHelper.ResultBundle resultBundle);
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
        public static final class DefaultImpls {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0015\u001a\u00020\bH\u00c6\u0003J7\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\bH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001d"}, d2 = {"Lcom/google/mediapipe/examples/facedetection/FaceDetectorHelper$ResultBundle;", "", "results", "", "Lcom/google/mediapipe/tasks/vision/facedetector/FaceDetectorResult;", "inferenceTime", "", "inputImageHeight", "", "inputImageWidth", "(Ljava/util/List;JII)V", "getInferenceTime", "()J", "getInputImageHeight", "()I", "getInputImageWidth", "getResults", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
    public static final class ResultBundle {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.google.mediapipe.tasks.vision.facedetector.FaceDetectorResult> results = null;
        private final long inferenceTime = 0L;
        private final int inputImageHeight = 0;
        private final int inputImageWidth = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.google.mediapipe.tasks.vision.facedetector.FaceDetectorResult> component1() {
            return null;
        }
        
        public final long component2() {
            return 0L;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int component4() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.mediapipe.examples.facedetection.FaceDetectorHelper.ResultBundle copy(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends com.google.mediapipe.tasks.vision.facedetector.FaceDetectorResult> results, long inferenceTime, int inputImageHeight, int inputImageWidth) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
        
        public ResultBundle(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends com.google.mediapipe.tasks.vision.facedetector.FaceDetectorResult> results, long inferenceTime, int inputImageHeight, int inputImageWidth) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.google.mediapipe.tasks.vision.facedetector.FaceDetectorResult> getResults() {
            return null;
        }
        
        public final long getInferenceTime() {
            return 0L;
        }
        
        public final int getInputImageHeight() {
            return 0;
        }
        
        public final int getInputImageWidth() {
            return 0;
        }
    }
}