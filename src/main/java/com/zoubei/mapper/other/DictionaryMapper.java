package com.zoubei.mapper.other;

import com.zoubei.entity.other.Dictionary;

public interface DictionaryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tra_dictionary
     *
     * @mbggenerated Sun Apr 15 15:21:40 CST 2018
     */
    int deleteByPrimaryKey(Integer dicId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tra_dictionary
     *
     * @mbggenerated Sun Apr 15 15:21:40 CST 2018
     */
    int insert(Dictionary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tra_dictionary
     *
     * @mbggenerated Sun Apr 15 15:21:40 CST 2018
     */
    int insertSelective(Dictionary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tra_dictionary
     *
     * @mbggenerated Sun Apr 15 15:21:40 CST 2018
     */
    Dictionary selectByPrimaryKey(Integer dicId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tra_dictionary
     *
     * @mbggenerated Sun Apr 15 15:21:40 CST 2018
     */
    int updateByPrimaryKeySelective(Dictionary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tra_dictionary
     *
     * @mbggenerated Sun Apr 15 15:21:40 CST 2018
     */
    int updateByPrimaryKey(Dictionary record);
}