/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package project.mvp.com.videoproject;

import java.util.ArrayList;
import java.util.List;

public final class MovieList {
    public static final String MOVIE_CATEGORY[] = {
            "我",
            "是",
            "第",
            "一",
            "个",
            "人",
    };

    private static List<Movie> list;
    private static long count = 0;

//    public static List<Movie> getList() {
//        if (list == null) {
//            list = setupMovies();
//        }
//        return list;
//    }

    public static List<Movie> setupMovies(List<Video.MediaInfoSetBean> bean) {
        list = new ArrayList<>();
        String title[] = new String[100];
        String studio[] = new String[100];
        String videoUrl[] =new String [100];
        String bgImageUrl[] =new String[100];
        String cardImageUrl[] =new String[100];
        String description = bean.get(0).getBasicInfo().getClassName();
        for (int i = 0; i < bean.size(); i++) {
            title[i]=bean.get(i).getBasicInfo().getName();
            studio[i]=bean.get(i).getBasicInfo().getCreateTime().substring(0,10);
            videoUrl[i]=bean.get(i).getBasicInfo().getMediaUrl();
            bgImageUrl[i]=bean.get(i).getBasicInfo().getCoverUrl();
            cardImageUrl[i]=bean.get(i).getBasicInfo().getCoverUrl();
        }

        for (int index = 0; index < bean.size(); ++index) {
            list.add(
                    buildMovieInfo(
                            title[index],
                            description,
                            studio[index],
                            videoUrl[index],
                            cardImageUrl[index],
                            bgImageUrl[index]));
        }

        return list;
    }

    private static Movie buildMovieInfo(
            String title,
            String description,
            String studio,
            String videoUrl,
            String cardImageUrl,
            String backgroundImageUrl) {
        Movie movie = new Movie();
        movie.setId(count++);
        movie.setTitle(title);
        movie.setDescription(description);
        movie.setStudio(studio);
        movie.setCardImageUrl(cardImageUrl);
        movie.setBackgroundImageUrl(backgroundImageUrl);
        movie.setVideoUrl(videoUrl);
        return movie;
    }
}