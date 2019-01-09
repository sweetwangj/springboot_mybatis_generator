package com.hans.boot_mybatis_generator_demo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_user
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class User implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   用户唯一标识符
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.uuid
     *
     * @mbg.generated
     */
    private String uuid;

    /**
     * Database Column Remarks:
     *   头像地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.icon
     *
     * @mbg.generated
     */
    private String icon;

    /**
     * Database Column Remarks:
     *   用户名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.username
     *
     * @mbg.generated
     */
    private String username;

    /**
     * Database Column Remarks:
     *   邮箱地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.email
     *
     * @mbg.generated
     */
    private String email;

    /**
     * Database Column Remarks:
     *   用户密码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     * Database Column Remarks:
     *   礼券(通过游戏赢得奖券,使用奖券兑换礼品)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.tictetz
     *
     * @mbg.generated
     */
    private Long tictetz;

    /**
     * Database Column Remarks:
     *   现金余额(自己充值的部分)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.cash
     *
     * @mbg.generated
     */
    private BigDecimal cash;

    /**
     * Database Column Remarks:
     *   奖励现金(无法体现,不能用于参加竞标赛)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.bounty
     *
     * @mbg.generated
     */
    private BigDecimal bounty;

    /**
     * Database Column Remarks:
     *   上次更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.updatetime
     *
     * @mbg.generated
     */
    private Date updatetime;

    /**
     * Database Column Remarks:
     *   国家
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.country
     *
     * @mbg.generated
     */
    private String country;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.level
     *
     * @mbg.generated
     */
    private Integer level;

    /**
     * Database Column Remarks:
     *   1 是机器人 0 不是  2是冻结
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.robot
     *
     * @mbg.generated
     */
    private Integer robot;

    /**
     * Database Column Remarks:
     *   积分墙的积分
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.qk_coin
     *
     * @mbg.generated
     */
    private Long qkCoin;

    /**
     * Database Column Remarks:
     *   加入的时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.add_time
     *
     * @mbg.generated
     */
    private Date addTime;

    /**
     * Database Column Remarks:
     *   邮箱是否认证  0是没有  1是认证了
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.email_authentication
     *
     * @mbg.generated
     */
    private Integer emailAuthentication;

    /**
     * Database Column Remarks:
     *   名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.first_name
     *
     * @mbg.generated
     */
    private String firstName;

    /**
     * Database Column Remarks:
     *   姓
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.last_name
     *
     * @mbg.generated
     */
    private String lastName;

    /**
     * Database Column Remarks:
     *   电话
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.phone
     *
     * @mbg.generated
     */
    private String phone;

    /**
     * Database Column Remarks:
     *   杯赛提示0的需要提示1不提示
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.champion_tip
     *
     * @mbg.generated
     */
    private Integer championTip;

    /**
     * Database Column Remarks:
     *   用户自己的邀请码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.my_invitation_code
     *
     * @mbg.generated
     */
    private String myInvitationCode;

    /**
     * Database Column Remarks:
     *   其他人的邀请码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.other_invitation_code
     *
     * @mbg.generated
     */
    private String otherInvitationCode;

    /**
     * Database Column Remarks:
     *   填写邀请码后比赛次数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.game_completion_times
     *
     * @mbg.generated
     */
    private Integer gameCompletionTimes;

    /**
     * Database Column Remarks:
     *   签到状态值 连续签到次数 -1为已完成连续签到
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.sign_statu
     *
     * @mbg.generated
     */
    private Integer signStatu;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_user
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.id
     *
     * @return the value of t_user.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.id
     *
     * @param id the value for t_user.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.uuid
     *
     * @return the value of t_user.uuid
     *
     * @mbg.generated
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.uuid
     *
     * @param uuid the value for t_user.uuid
     *
     * @mbg.generated
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.icon
     *
     * @return the value of t_user.icon
     *
     * @mbg.generated
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.icon
     *
     * @param icon the value for t_user.icon
     *
     * @mbg.generated
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.username
     *
     * @return the value of t_user.username
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.username
     *
     * @param username the value for t_user.username
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.email
     *
     * @return the value of t_user.email
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.email
     *
     * @param email the value for t_user.email
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.password
     *
     * @return the value of t_user.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.password
     *
     * @param password the value for t_user.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.tictetz
     *
     * @return the value of t_user.tictetz
     *
     * @mbg.generated
     */
    public Long getTictetz() {
        return tictetz;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.tictetz
     *
     * @param tictetz the value for t_user.tictetz
     *
     * @mbg.generated
     */
    public void setTictetz(Long tictetz) {
        this.tictetz = tictetz;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.cash
     *
     * @return the value of t_user.cash
     *
     * @mbg.generated
     */
    public BigDecimal getCash() {
        return cash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.cash
     *
     * @param cash the value for t_user.cash
     *
     * @mbg.generated
     */
    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.bounty
     *
     * @return the value of t_user.bounty
     *
     * @mbg.generated
     */
    public BigDecimal getBounty() {
        return bounty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.bounty
     *
     * @param bounty the value for t_user.bounty
     *
     * @mbg.generated
     */
    public void setBounty(BigDecimal bounty) {
        this.bounty = bounty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.updatetime
     *
     * @return the value of t_user.updatetime
     *
     * @mbg.generated
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.updatetime
     *
     * @param updatetime the value for t_user.updatetime
     *
     * @mbg.generated
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.country
     *
     * @return the value of t_user.country
     *
     * @mbg.generated
     */
    public String getCountry() {
        return country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.country
     *
     * @param country the value for t_user.country
     *
     * @mbg.generated
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.level
     *
     * @return the value of t_user.level
     *
     * @mbg.generated
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.level
     *
     * @param level the value for t_user.level
     *
     * @mbg.generated
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.robot
     *
     * @return the value of t_user.robot
     *
     * @mbg.generated
     */
    public Integer getRobot() {
        return robot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.robot
     *
     * @param robot the value for t_user.robot
     *
     * @mbg.generated
     */
    public void setRobot(Integer robot) {
        this.robot = robot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.qk_coin
     *
     * @return the value of t_user.qk_coin
     *
     * @mbg.generated
     */
    public Long getQkCoin() {
        return qkCoin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.qk_coin
     *
     * @param qkCoin the value for t_user.qk_coin
     *
     * @mbg.generated
     */
    public void setQkCoin(Long qkCoin) {
        this.qkCoin = qkCoin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.add_time
     *
     * @return the value of t_user.add_time
     *
     * @mbg.generated
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.add_time
     *
     * @param addTime the value for t_user.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.email_authentication
     *
     * @return the value of t_user.email_authentication
     *
     * @mbg.generated
     */
    public Integer getEmailAuthentication() {
        return emailAuthentication;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.email_authentication
     *
     * @param emailAuthentication the value for t_user.email_authentication
     *
     * @mbg.generated
     */
    public void setEmailAuthentication(Integer emailAuthentication) {
        this.emailAuthentication = emailAuthentication;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.first_name
     *
     * @return the value of t_user.first_name
     *
     * @mbg.generated
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.first_name
     *
     * @param firstName the value for t_user.first_name
     *
     * @mbg.generated
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.last_name
     *
     * @return the value of t_user.last_name
     *
     * @mbg.generated
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.last_name
     *
     * @param lastName the value for t_user.last_name
     *
     * @mbg.generated
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.phone
     *
     * @return the value of t_user.phone
     *
     * @mbg.generated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.phone
     *
     * @param phone the value for t_user.phone
     *
     * @mbg.generated
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.champion_tip
     *
     * @return the value of t_user.champion_tip
     *
     * @mbg.generated
     */
    public Integer getChampionTip() {
        return championTip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.champion_tip
     *
     * @param championTip the value for t_user.champion_tip
     *
     * @mbg.generated
     */
    public void setChampionTip(Integer championTip) {
        this.championTip = championTip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.my_invitation_code
     *
     * @return the value of t_user.my_invitation_code
     *
     * @mbg.generated
     */
    public String getMyInvitationCode() {
        return myInvitationCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.my_invitation_code
     *
     * @param myInvitationCode the value for t_user.my_invitation_code
     *
     * @mbg.generated
     */
    public void setMyInvitationCode(String myInvitationCode) {
        this.myInvitationCode = myInvitationCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.other_invitation_code
     *
     * @return the value of t_user.other_invitation_code
     *
     * @mbg.generated
     */
    public String getOtherInvitationCode() {
        return otherInvitationCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.other_invitation_code
     *
     * @param otherInvitationCode the value for t_user.other_invitation_code
     *
     * @mbg.generated
     */
    public void setOtherInvitationCode(String otherInvitationCode) {
        this.otherInvitationCode = otherInvitationCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.game_completion_times
     *
     * @return the value of t_user.game_completion_times
     *
     * @mbg.generated
     */
    public Integer getGameCompletionTimes() {
        return gameCompletionTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.game_completion_times
     *
     * @param gameCompletionTimes the value for t_user.game_completion_times
     *
     * @mbg.generated
     */
    public void setGameCompletionTimes(Integer gameCompletionTimes) {
        this.gameCompletionTimes = gameCompletionTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.sign_statu
     *
     * @return the value of t_user.sign_statu
     *
     * @mbg.generated
     */
    public Integer getSignStatu() {
        return signStatu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.sign_statu
     *
     * @param signStatu the value for t_user.sign_statu
     *
     * @mbg.generated
     */
    public void setSignStatu(Integer signStatu) {
        this.signStatu = signStatu;
    }
}