package com.zoubei.mapper.scene;

import com.zoubei.entity.scene.AppImage;

public interface AppImageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tra_app_img
     *
     * @mbggenerated Sun Apr 15 15:09:08 CST 2018
     */
    int deleteByPrimaryKey(Integer imgId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tra_app_img
     *
     * @mbggenerated Sun Apr 15 15:09:08 CST 2018
     */
    int insert(AppImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tra_app_img
     *
     * @mbggenerated Sun Apr 15 15:09:08 CST 2018
     */
    int insertSelective(AppImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tra_app_img
     *
     * @mbggenerated Sun Apr 15 15:09:08 CST 2018
     */
    AppImage selectByPrimaryKey(Integer imgId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tra_app_img
     *
     * @mbggenerated Sun Apr 15 15:09:08 CST 2018
     */
    int updateByPrimaryKeySelective(AppImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tra_app_img
     *
     * @mbggenerated Sun Apr 15 15:09:08 CST 2018
     */
    int updateByPrimaryKey(AppImage record);
}