package com.hatcher.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hatcher.entity.Img;
import com.hatcher.vo.ImgDisplay;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author HatcherCheung
 * @since 2021-10-25
 */
public interface IImgService extends IService<Img> {
	/**
	 * 添加图片
	 *
	 * @param img 图片对象
	 * @return
	 */
	int addImg(Img img);

	/**
	 * 查询用户发布的所有图片信息
	 *
	 * @param userId 用户id
	 * @return
	 */
	List<ImgDisplay> queryImgsByUserId(String userId);

	/**
	 * 删除图片
	 *
	 * @param imgId 图片id
	 * @return 删除成功返回1
	 */
	Integer deleteImgByImgId(String imgId);

	/**
	 * 获取分组中照片的数量
	 *
	 * @param groupId
	 * @return
	 */
	Integer getGroupImgNum(String groupId);
}
