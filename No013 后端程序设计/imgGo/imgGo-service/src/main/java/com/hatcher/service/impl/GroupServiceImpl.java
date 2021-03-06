package com.hatcher.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hatcher.bo.AddGroupBo;
import com.hatcher.dao.GroupMapper;
import com.hatcher.dao.UserMapper;
import com.hatcher.entity.Group;
import com.hatcher.entity.User;
import com.hatcher.service.IGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author HatcherCheung
 * @since 2021-10-25
 */
@Service
public class GroupServiceImpl extends ServiceImpl<GroupMapper, Group> implements IGroupService {
	@Autowired
	private GroupMapper groupDao;
	@Autowired
	private UserMapper userDao;

	@Override
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
	public String addGroupInfo(AddGroupBo groupBo) {
		Group group = new Group();
		group.setGroupName(groupBo.getGroupName());
		group.setGroupContent(groupBo.getGroupContent());
		group.setUserId(groupBo.getUserId());
		String userId = group.getUserId();
		User user = userDao.selectById(userId);
		if (user != null) {
			groupDao.insert(group);
			return group.getId();
		}
		return "null";
	}


}
