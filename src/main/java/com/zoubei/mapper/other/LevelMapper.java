package com.zoubei.mapper.other;

import com.zoubei.entity.other.Level;

public interface LevelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tra_level
     *
     * @mbggenerated Sun Apr 15 15:21:28 CST 2018
     */
    int deleteByPrimaryKey(Integer levelId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tra_level
     *
     * @mbggenerated Sun Apr 15 15:21:28 CST 2018
     */
    int insert(Level record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tra_level
     *
     * @mbggenerated Sun Apr 15 15:21:28 CST 2018
     */
    int insertSelective(Level record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tra_level
     *
     * @mbggenerated Sun Apr 15 15:21:28 CST 2018
     */
    Level selectByPrimaryKey(Integer levelId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tra_level
     *
     * @mbggenerated Sun Apr 15 15:21:28 CST 2018
     */
    int updateByPrimaryKeySelective(Level record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tra_level
     *
     * @mbggenerated Sun Apr 15 15:21:28 CST 2018
     */
    int updateByPrimaryKey(Level record);
}