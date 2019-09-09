package project.mvp.com.videoproject;

import java.util.List;

/**
 * 创建人 张岩
 * 时间   2019/6/28.
 * 类描述
 */
public class Video {

    /**
     * TotalCount : 3
     * MediaInfoSet : [{"BasicInfo":{"Name":"北外诺加托业考试技巧","Description":"","CreateTime":"2019-06-18T01:31:00Z","UpdateTime":"2019-06-18T01:31:33Z","ExpireTime":"9999-12-31T23:59:59Z","ClassId":587021,"ClassName":"北开外语","ClassPath":"北开外语","CoverUrl":"http://1252868127.vod2.myqcloud.com/3063ecf4vodtranscq1252868127/11a109195285890790446049767/snapshot/1560821463_987371988.100_0.jpg","Type":"mp4","MediaUrl":"http://1252868127.vod2.myqcloud.com/5979ff4cvodcq1252868127/11a109195285890790446049767/f0.mp4","SourceInfo":{"SourceType":"Upload","SourceContext":""},"StorageRegion":"ap-chongqing","TagSet":[],"Vid":"5285890790446049767"},"MetaData":null,"TranscodeInfo":null,"AnimatedGraphicsInfo":null,"SampleSnapshotInfo":null,"ImageSpriteInfo":null,"SnapshotByTimeOffsetInfo":null,"KeyFrameDescInfo":null,"AdaptiveDynamicStreamingInfo":null,"FileId":"5285890790446049767"},{"BasicInfo":{"Name":"富兰克林美国高中介绍","Description":"","CreateTime":"2019-06-17T03:04:19Z","UpdateTime":"2019-06-17T03:05:54Z","ExpireTime":"9999-12-31T23:59:59Z","ClassId":586767,"ClassName":"富兰克林","ClassPath":"富兰克林","CoverUrl":"http://1252868127.vod2.myqcloud.com/3063ecf4vodtranscq1252868127/d7c39d525285890790411564874/snapshot/1560740661_3577157947.100_0.jpg","Type":"mp4","MediaUrl":"http://1252868127.vod2.myqcloud.com/5979ff4cvodcq1252868127/d7c39d525285890790411564874/f0.mp4","SourceInfo":{"SourceType":"Upload","SourceContext":""},"StorageRegion":"ap-chongqing","TagSet":[],"Vid":"5285890790411564874"},"MetaData":null,"TranscodeInfo":null,"AnimatedGraphicsInfo":null,"SampleSnapshotInfo":null,"ImageSpriteInfo":null,"SnapshotByTimeOffsetInfo":null,"KeyFrameDescInfo":null,"AdaptiveDynamicStreamingInfo":null,"FileId":"5285890790411564874"},{"BasicInfo":{"Name":"富兰克林赏入学指南","Description":"","CreateTime":"2019-06-17T03:00:30Z","UpdateTime":"2019-06-17T03:05:19Z","ExpireTime":"9999-12-31T23:59:59Z","ClassId":586767,"ClassName":"富兰克林","ClassPath":"富兰克林","CoverUrl":"http://1252868127.vod2.myqcloud.com/3063ecf4vodtranscq1252868127/d59293c65285890790411484402/snapshot/1560740432_3528167100.100_0.jpg","Type":"mp4","MediaUrl":"http://1252868127.vod2.myqcloud.com/5979ff4cvodcq1252868127/d59293c65285890790411484402/f0.mp4","SourceInfo":{"SourceType":"Upload","SourceContext":""},"StorageRegion":"ap-chongqing","TagSet":[],"Vid":"5285890790411484402"},"MetaData":null,"TranscodeInfo":null,"AnimatedGraphicsInfo":null,"SampleSnapshotInfo":null,"ImageSpriteInfo":null,"SnapshotByTimeOffsetInfo":null,"KeyFrameDescInfo":null,"AdaptiveDynamicStreamingInfo":null,"FileId":"5285890790411484402"}]
     * RequestId : 50d87513-05d3-45c8-a7db-bfcd6364bfd9
     */

    private int TotalCount;
    private String RequestId;
    private List<MediaInfoSetBean> MediaInfoSet;

    public int getTotalCount() {
        return TotalCount;
    }

    public void setTotalCount(int TotalCount) {
        this.TotalCount = TotalCount;
    }

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public List<MediaInfoSetBean> getMediaInfoSet() {
        return MediaInfoSet;
    }

    public void setMediaInfoSet(List<MediaInfoSetBean> MediaInfoSet) {
        this.MediaInfoSet = MediaInfoSet;
    }

    public static class MediaInfoSetBean {
        /**
         * BasicInfo : {"Name":"北外诺加托业考试技巧","Description":"","CreateTime":"2019-06-18T01:31:00Z","UpdateTime":"2019-06-18T01:31:33Z","ExpireTime":"9999-12-31T23:59:59Z","ClassId":587021,"ClassName":"北开外语","ClassPath":"北开外语","CoverUrl":"http://1252868127.vod2.myqcloud.com/3063ecf4vodtranscq1252868127/11a109195285890790446049767/snapshot/1560821463_987371988.100_0.jpg","Type":"mp4","MediaUrl":"http://1252868127.vod2.myqcloud.com/5979ff4cvodcq1252868127/11a109195285890790446049767/f0.mp4","SourceInfo":{"SourceType":"Upload","SourceContext":""},"StorageRegion":"ap-chongqing","TagSet":[],"Vid":"5285890790446049767"}
         * MetaData : null
         * TranscodeInfo : null
         * AnimatedGraphicsInfo : null
         * SampleSnapshotInfo : null
         * ImageSpriteInfo : null
         * SnapshotByTimeOffsetInfo : null
         * KeyFrameDescInfo : null
         * AdaptiveDynamicStreamingInfo : null
         * FileId : 5285890790446049767
         */

        private BasicInfoBean BasicInfo;
        private Object MetaData;
        private Object TranscodeInfo;
        private Object AnimatedGraphicsInfo;
        private Object SampleSnapshotInfo;
        private Object ImageSpriteInfo;
        private Object SnapshotByTimeOffsetInfo;
        private Object KeyFrameDescInfo;
        private Object AdaptiveDynamicStreamingInfo;
        private String FileId;

        public BasicInfoBean getBasicInfo() {
            return BasicInfo;
        }

        public void setBasicInfo(BasicInfoBean BasicInfo) {
            this.BasicInfo = BasicInfo;
        }

        public Object getMetaData() {
            return MetaData;
        }

        public void setMetaData(Object MetaData) {
            this.MetaData = MetaData;
        }

        public Object getTranscodeInfo() {
            return TranscodeInfo;
        }

        public void setTranscodeInfo(Object TranscodeInfo) {
            this.TranscodeInfo = TranscodeInfo;
        }

        public Object getAnimatedGraphicsInfo() {
            return AnimatedGraphicsInfo;
        }

        public void setAnimatedGraphicsInfo(Object AnimatedGraphicsInfo) {
            this.AnimatedGraphicsInfo = AnimatedGraphicsInfo;
        }

        public Object getSampleSnapshotInfo() {
            return SampleSnapshotInfo;
        }

        public void setSampleSnapshotInfo(Object SampleSnapshotInfo) {
            this.SampleSnapshotInfo = SampleSnapshotInfo;
        }

        public Object getImageSpriteInfo() {
            return ImageSpriteInfo;
        }

        public void setImageSpriteInfo(Object ImageSpriteInfo) {
            this.ImageSpriteInfo = ImageSpriteInfo;
        }

        public Object getSnapshotByTimeOffsetInfo() {
            return SnapshotByTimeOffsetInfo;
        }

        public void setSnapshotByTimeOffsetInfo(Object SnapshotByTimeOffsetInfo) {
            this.SnapshotByTimeOffsetInfo = SnapshotByTimeOffsetInfo;
        }

        public Object getKeyFrameDescInfo() {
            return KeyFrameDescInfo;
        }

        public void setKeyFrameDescInfo(Object KeyFrameDescInfo) {
            this.KeyFrameDescInfo = KeyFrameDescInfo;
        }

        public Object getAdaptiveDynamicStreamingInfo() {
            return AdaptiveDynamicStreamingInfo;
        }

        public void setAdaptiveDynamicStreamingInfo(Object AdaptiveDynamicStreamingInfo) {
            this.AdaptiveDynamicStreamingInfo = AdaptiveDynamicStreamingInfo;
        }

        public String getFileId() {
            return FileId;
        }

        public void setFileId(String FileId) {
            this.FileId = FileId;
        }


        public static class BasicInfoBean {
            /**
             * Name : 北外诺加托业考试技巧
             * Description :
             * CreateTime : 2019-06-18T01:31:00Z
             * UpdateTime : 2019-06-18T01:31:33Z
             * ExpireTime : 9999-12-31T23:59:59Z
             * ClassId : 587021
             * ClassName : 北开外语
             * ClassPath : 北开外语
             * CoverUrl : http://1252868127.vod2.myqcloud.com/3063ecf4vodtranscq1252868127/11a109195285890790446049767/snapshot/1560821463_987371988.100_0.jpg
             * Type : mp4
             * MediaUrl : http://1252868127.vod2.myqcloud.com/5979ff4cvodcq1252868127/11a109195285890790446049767/f0.mp4
             * SourceInfo : {"SourceType":"Upload","SourceContext":""}
             * StorageRegion : ap-chongqing
             * TagSet : []
             * Vid : 5285890790446049767
             */

            private String Name;
            private String Description;
            private String CreateTime;
            private String UpdateTime;
            private String ExpireTime;
            private int ClassId;
            private String ClassName;
            private String ClassPath;
            private String CoverUrl;
            private String Type;
            private String MediaUrl;
            private SourceInfoBean SourceInfo;
            private String StorageRegion;
            private String Vid;
            private List<?> TagSet;

            public String getName() {
                return Name;
            }

            public void setName(String Name) {
                this.Name = Name;
            }

            public String getDescription() {
                return Description;
            }

            public void setDescription(String Description) {
                this.Description = Description;
            }

            public String getCreateTime() {
                return CreateTime;
            }

            public void setCreateTime(String CreateTime) {
                this.CreateTime = CreateTime;
            }

            public String getUpdateTime() {
                return UpdateTime;
            }

            public void setUpdateTime(String UpdateTime) {
                this.UpdateTime = UpdateTime;
            }

            public String getExpireTime() {
                return ExpireTime;
            }

            public void setExpireTime(String ExpireTime) {
                this.ExpireTime = ExpireTime;
            }

            public int getClassId() {
                return ClassId;
            }

            public void setClassId(int ClassId) {
                this.ClassId = ClassId;
            }

            public String getClassName() {
                return ClassName;
            }

            public void setClassName(String ClassName) {
                this.ClassName = ClassName;
            }

            public String getClassPath() {
                return ClassPath;
            }

            public void setClassPath(String ClassPath) {
                this.ClassPath = ClassPath;
            }

            public String getCoverUrl() {
                return CoverUrl;
            }

            public void setCoverUrl(String CoverUrl) {
                this.CoverUrl = CoverUrl;
            }

            public String getType() {
                return Type;
            }

            public void setType(String Type) {
                this.Type = Type;
            }

            public String getMediaUrl() {
                return MediaUrl;
            }

            public void setMediaUrl(String MediaUrl) {
                this.MediaUrl = MediaUrl;
            }

            public SourceInfoBean getSourceInfo() {
                return SourceInfo;
            }

            public void setSourceInfo(SourceInfoBean SourceInfo) {
                this.SourceInfo = SourceInfo;
            }

            public String getStorageRegion() {
                return StorageRegion;
            }

            public void setStorageRegion(String StorageRegion) {
                this.StorageRegion = StorageRegion;
            }

            public String getVid() {
                return Vid;
            }

            public void setVid(String Vid) {
                this.Vid = Vid;
            }

            public List<?> getTagSet() {
                return TagSet;
            }

            public void setTagSet(List<?> TagSet) {
                this.TagSet = TagSet;
            }

            public static class SourceInfoBean {
                /**
                 * SourceType : Upload
                 * SourceContext :
                 */

                private String SourceType;
                private String SourceContext;

                public String getSourceType() {
                    return SourceType;
                }

                public void setSourceType(String SourceType) {
                    this.SourceType = SourceType;
                }

                public String getSourceContext() {
                    return SourceContext;
                }

                public void setSourceContext(String SourceContext) {
                    this.SourceContext = SourceContext;
                }
            }
        }
    }
}
