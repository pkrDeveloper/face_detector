package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.google.mediapipe.examples.facedetection.DataBinderMapperImpl());
  }
}
