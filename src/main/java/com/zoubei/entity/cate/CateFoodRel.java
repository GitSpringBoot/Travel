package com.zoubei.entity.cate;

public class CateFoodRel {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tra_cate_food_rel.cate_id
     *
     * @mbggenerated Sun Apr 15 15:12:40 CST 2018
     */
    private Integer cateId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tra_cate_food_rel.food_id
     *
     * @mbggenerated Sun Apr 15 15:12:40 CST 2018
     */
    private Integer foodId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tra_cate_food_rel.cate_id
     *
     * @return the value of tra_cate_food_rel.cate_id
     *
     * @mbggenerated Sun Apr 15 15:12:40 CST 2018
     */
    public Integer getCateId() {
        return cateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tra_cate_food_rel.cate_id
     *
     * @param cateId the value for tra_cate_food_rel.cate_id
     *
     * @mbggenerated Sun Apr 15 15:12:40 CST 2018
     */
    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tra_cate_food_rel.food_id
     *
     * @return the value of tra_cate_food_rel.food_id
     *
     * @mbggenerated Sun Apr 15 15:12:40 CST 2018
     */
    public Integer getFoodId() {
        return foodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tra_cate_food_rel.food_id
     *
     * @param foodId the value for tra_cate_food_rel.food_id
     *
     * @mbggenerated Sun Apr 15 15:12:40 CST 2018
     */
    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }
}