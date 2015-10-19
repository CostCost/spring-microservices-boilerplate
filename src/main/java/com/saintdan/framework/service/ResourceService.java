package com.saintdan.framework.service;

import com.saintdan.framework.exception.GroupException;
import com.saintdan.framework.exception.ResourceException;
import com.saintdan.framework.param.ResourceParam;
import com.saintdan.framework.po.Resource;
import com.saintdan.framework.vo.ResourceVO;
import com.saintdan.framework.vo.ResourcesVO;

/**
 * Resource's Service.
 *
 * @author <a href="http://github.com/saintdan">Liao Yifan</a>
 * @date 10/16/15
 * @since JDK1.8
 */
public interface ResourceService {

    /**
     * Create new resource.
     *
     * @param param         resource's params
     * @return              resource's VO
     * @throws ResourceException        RSC0031 Resource already existing, name taken.
     * @throws GroupException           GRP0012 Cannot find any group by this id param.
     */
    ResourceVO create(ResourceParam param) throws ResourceException, GroupException;

    /**
     * Show all resources' VO.
     *
     * @return              resources' VO
     * @throws ResourceException        RSC0011 No resource exist.
     */
    ResourcesVO getAllResources() throws ResourceException;

    /**
     * Show resources by ids.
     *
     * @param ids           resources' ids
     * @return              resources' PO
     * @throws ResourceException        GRP0012 Cannot find any resource by this id param.
     */
    Iterable<Resource> getResourcesByIds(Iterable<Long> ids) throws ResourceException;

    /**
     * Show resource's VO by resource's id.
     *
     * @param param         resource's params
     * @return              resource's VO
     * @throws ResourceException        RSC0012 Cannot find any resource by this id param.
     */
    ResourceVO getResourceById(ResourceParam param) throws ResourceException;

    /**
     * Show resource's VO by resource's name.
     *
     * @param param         resource's params
     * @return              resource's VO
     * @throws ResourceException        RSC0011 Cannot find any resource by this name param.
     */
    ResourceVO getResourceByName(ResourceParam param) throws ResourceException;

    /**
     * Show resource's VO by resource's name.
     *
     * @param param         resource's params
     * @return              resource's VO
     * @throws ResourceException        RSC0011 Cannot find any resource by this name param.
     */
    ResourceVO getResourceByPath(ResourceParam param) throws ResourceException;

    /**
     * Update resource.
     *
     * @param param         resource's params
     * @return              resource's VO
     * @throws ResourceException        RSC0012 Cannot find any resource by this id param.
     * @throws GroupException           GRP0012 Cannot find any group by this id param.
     */
    ResourceVO update(ResourceParam param) throws ResourceException, GroupException;

    /**
     * Delete resource.
     *
     * @param param         resource's params.
     * @throws ResourceException        RSC0012 Cannot find any resource by this id param.
     */
    void delete(ResourceParam param) throws ResourceException;

}