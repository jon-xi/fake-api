package hk.org.empf.cas.contribution.repository.chunk;

import hk.org.empf.cas.contribution.chunk.model.UploadChunkMaster;
import hk.org.empf.cas.contribution.chunk.model.UploadChunkRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Mapper
@Repository
@SuppressWarnings({"unused", "UnusedReturnValue"})
public interface ChunkTestMapper {

    int saveMaster(@Param("chunkMaster") UploadChunkMaster chunkMaster);

    List<UploadChunkMaster> selectMaster(@Param("uploadUuid") UUID uploadUuid);

    List<UUID> selectMasterIDs(@Param("limits") int limits);

    List<UploadChunkMaster> selectMasterByChunk(@Param("chunkUuid") UUID chunkUuid);

    int updateMasterProgress(@Param("uploadUuid") UUID uploadUuid);

    int updateMasterStatus(@Param("uploadUuid") UUID uploadUuid, @Param("statusCode") int statusCode);

    int deleteMasters(@Param("days") int days);

    int saveChunk(@Param("chunkRecord") UploadChunkRecord chunkRecord);

    List<UploadChunkRecord> selectNewChunk(@Param("chunkUuid") UUID chunkUuid);

    List<UUID> selectNewChunkIDs(@Param("type") int type, @Param("limits") int limits);

    int updateChunkToStarted(@Param("chunkUuid") UUID chunkUuid);

    int updateChunkStatus(@Param("chunkUuid") UUID chunkUuid, @Param("statusCode") int statusCode);

    int deleteChunks(@Param("days") int days);

}
