package p207y0;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import androidx.media3.exoplayer.DefaultLoadControl;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import okhttp3.C2181z;
import p002a1.AbstractC0008a1;
import p077j$.util.DesugarTimeZone;
import p168t2.AbstractC2415i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: y0.g */
/* loaded from: classes.dex */
public final class C2790g {

    /* renamed from: A */
    public static final byte[] f10362A;

    /* renamed from: B */
    public static final String[] f10363B;

    /* renamed from: C */
    public static final int[] f10364C;

    /* renamed from: D */
    public static final byte[] f10365D;

    /* renamed from: E */
    public static final C2787d f10366E;

    /* renamed from: F */
    public static final C2787d[][] f10367F;

    /* renamed from: G */
    public static final C2787d[] f10368G;

    /* renamed from: H */
    public static final HashMap[] f10369H;

    /* renamed from: I */
    public static final HashMap[] f10370I;

    /* renamed from: J */
    public static final HashSet f10371J;

    /* renamed from: K */
    public static final HashMap f10372K;

    /* renamed from: L */
    public static final Charset f10373L;

    /* renamed from: M */
    public static final byte[] f10374M;

    /* renamed from: N */
    public static final byte[] f10375N;

    /* renamed from: l */
    public static final boolean f10376l = Log.isLoggable("ExifInterface", 3);

    /* renamed from: m */
    public static final int[] f10377m;

    /* renamed from: n */
    public static final int[] f10378n;

    /* renamed from: o */
    public static final byte[] f10379o;

    /* renamed from: p */
    public static final byte[] f10380p;

    /* renamed from: q */
    public static final byte[] f10381q;

    /* renamed from: r */
    public static final byte[] f10382r;

    /* renamed from: s */
    public static final byte[] f10383s;

    /* renamed from: t */
    public static final byte[] f10384t;

    /* renamed from: u */
    public static final byte[] f10385u;

    /* renamed from: v */
    public static final byte[] f10386v;

    /* renamed from: w */
    public static final byte[] f10387w;

    /* renamed from: x */
    public static final byte[] f10388x;

    /* renamed from: y */
    public static final byte[] f10389y;

    /* renamed from: z */
    public static final byte[] f10390z;

    /* renamed from: a */
    public final FileDescriptor f10391a;

    /* renamed from: b */
    public final AssetManager.AssetInputStream f10392b;

    /* renamed from: c */
    public int f10393c;

    /* renamed from: d */
    public final HashMap[] f10394d;

    /* renamed from: e */
    public final HashSet f10395e;

    /* renamed from: f */
    public ByteOrder f10396f;

    /* renamed from: g */
    public boolean f10397g;

    /* renamed from: h */
    public int f10398h;

    /* renamed from: i */
    public int f10399i;

    /* renamed from: j */
    public int f10400j;

    /* renamed from: k */
    public int f10401k;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f10377m = new int[]{8, 8, 8};
        f10378n = new int[]{8};
        f10379o = new byte[]{-1, -40, -1};
        f10380p = new byte[]{102, 116, 121, 112};
        f10381q = new byte[]{109, 105, 102, 49};
        f10382r = new byte[]{104, 101, 105, 99};
        f10383s = new byte[]{79, 76, 89, 77, 80, 0};
        f10384t = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f10385u = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f10386v = new byte[]{101, 88, 73, 102};
        f10387w = new byte[]{73, 72, 68, 82};
        f10388x = new byte[]{73, 69, 78, 68};
        f10389y = new byte[]{82, 73, 70, 70};
        f10390z = new byte[]{87, 69, 66, 80};
        f10362A = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f10363B = new String[]{C2181z.FRAGMENT_ENCODE_SET, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f10364C = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f10365D = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C2787d[] c2787dArr = {new C2787d("NewSubfileType", 254, 4), new C2787d("SubfileType", 255, 4), new C2787d("ImageWidth", 256, 3, 4), new C2787d("ImageLength", 257, 3, 4), new C2787d("BitsPerSample", 258, 3), new C2787d("Compression", 259, 3), new C2787d("PhotometricInterpretation", 262, 3), new C2787d("ImageDescription", 270, 2), new C2787d("Make", 271, 2), new C2787d("Model", 272, 2), new C2787d("StripOffsets", 273, 3, 4), new C2787d("Orientation", 274, 3), new C2787d("SamplesPerPixel", 277, 3), new C2787d("RowsPerStrip", 278, 3, 4), new C2787d("StripByteCounts", 279, 3, 4), new C2787d("XResolution", 282, 5), new C2787d("YResolution", 283, 5), new C2787d("PlanarConfiguration", 284, 3), new C2787d("ResolutionUnit", 296, 3), new C2787d("TransferFunction", 301, 3), new C2787d("Software", 305, 2), new C2787d("DateTime", 306, 2), new C2787d("Artist", 315, 2), new C2787d("WhitePoint", 318, 5), new C2787d("PrimaryChromaticities", 319, 5), new C2787d("SubIFDPointer", 330, 4), new C2787d("JPEGInterchangeFormat", 513, 4), new C2787d("JPEGInterchangeFormatLength", 514, 4), new C2787d("YCbCrCoefficients", 529, 5), new C2787d("YCbCrSubSampling", 530, 3), new C2787d("YCbCrPositioning", 531, 3), new C2787d("ReferenceBlackWhite", 532, 5), new C2787d("Copyright", 33432, 2), new C2787d("ExifIFDPointer", 34665, 4), new C2787d("GPSInfoIFDPointer", 34853, 4), new C2787d("SensorTopBorder", 4, 4), new C2787d("SensorLeftBorder", 5, 4), new C2787d("SensorBottomBorder", 6, 4), new C2787d("SensorRightBorder", 7, 4), new C2787d("ISO", 23, 3), new C2787d("JpgFromRaw", 46, 7), new C2787d("Xmp", 700, 1)};
        C2787d[] c2787dArr2 = {new C2787d("ExposureTime", 33434, 5), new C2787d("FNumber", 33437, 5), new C2787d("ExposureProgram", 34850, 3), new C2787d("SpectralSensitivity", 34852, 2), new C2787d("PhotographicSensitivity", 34855, 3), new C2787d("OECF", 34856, 7), new C2787d("SensitivityType", 34864, 3), new C2787d("StandardOutputSensitivity", 34865, 4), new C2787d("RecommendedExposureIndex", 34866, 4), new C2787d("ISOSpeed", 34867, 4), new C2787d("ISOSpeedLatitudeyyy", 34868, 4), new C2787d("ISOSpeedLatitudezzz", 34869, 4), new C2787d("ExifVersion", 36864, 2), new C2787d("DateTimeOriginal", 36867, 2), new C2787d("DateTimeDigitized", 36868, 2), new C2787d("OffsetTime", 36880, 2), new C2787d("OffsetTimeOriginal", 36881, 2), new C2787d("OffsetTimeDigitized", 36882, 2), new C2787d("ComponentsConfiguration", 37121, 7), new C2787d("CompressedBitsPerPixel", 37122, 5), new C2787d("ShutterSpeedValue", 37377, 10), new C2787d("ApertureValue", 37378, 5), new C2787d("BrightnessValue", 37379, 10), new C2787d("ExposureBiasValue", 37380, 10), new C2787d("MaxApertureValue", 37381, 5), new C2787d("SubjectDistance", 37382, 5), new C2787d("MeteringMode", 37383, 3), new C2787d("LightSource", 37384, 3), new C2787d("Flash", 37385, 3), new C2787d("FocalLength", 37386, 5), new C2787d("SubjectArea", 37396, 3), new C2787d("MakerNote", 37500, 7), new C2787d("UserComment", 37510, 7), new C2787d("SubSecTime", 37520, 2), new C2787d("SubSecTimeOriginal", 37521, 2), new C2787d("SubSecTimeDigitized", 37522, 2), new C2787d("FlashpixVersion", 40960, 7), new C2787d("ColorSpace", 40961, 3), new C2787d("PixelXDimension", 40962, 3, 4), new C2787d("PixelYDimension", 40963, 3, 4), new C2787d("RelatedSoundFile", 40964, 2), new C2787d("InteroperabilityIFDPointer", 40965, 4), new C2787d("FlashEnergy", 41483, 5), new C2787d("SpatialFrequencyResponse", 41484, 7), new C2787d("FocalPlaneXResolution", 41486, 5), new C2787d("FocalPlaneYResolution", 41487, 5), new C2787d("FocalPlaneResolutionUnit", 41488, 3), new C2787d("SubjectLocation", 41492, 3), new C2787d("ExposureIndex", 41493, 5), new C2787d("SensingMethod", 41495, 3), new C2787d("FileSource", 41728, 7), new C2787d("SceneType", 41729, 7), new C2787d("CFAPattern", 41730, 7), new C2787d("CustomRendered", 41985, 3), new C2787d("ExposureMode", 41986, 3), new C2787d("WhiteBalance", 41987, 3), new C2787d("DigitalZoomRatio", 41988, 5), new C2787d("FocalLengthIn35mmFilm", 41989, 3), new C2787d("SceneCaptureType", 41990, 3), new C2787d("GainControl", 41991, 3), new C2787d("Contrast", 41992, 3), new C2787d("Saturation", 41993, 3), new C2787d("Sharpness", 41994, 3), new C2787d("DeviceSettingDescription", 41995, 7), new C2787d("SubjectDistanceRange", 41996, 3), new C2787d("ImageUniqueID", 42016, 2), new C2787d("CameraOwnerName", 42032, 2), new C2787d("BodySerialNumber", 42033, 2), new C2787d("LensSpecification", 42034, 5), new C2787d("LensMake", 42035, 2), new C2787d("LensModel", 42036, 2), new C2787d("Gamma", 42240, 5), new C2787d("DNGVersion", 50706, 1), new C2787d("DefaultCropSize", 50720, 3, 4)};
        C2787d[] c2787dArr3 = {new C2787d("GPSVersionID", 0, 1), new C2787d("GPSLatitudeRef", 1, 2), new C2787d("GPSLatitude", 2, 5, 10), new C2787d("GPSLongitudeRef", 3, 2), new C2787d("GPSLongitude", 4, 5, 10), new C2787d("GPSAltitudeRef", 5, 1), new C2787d("GPSAltitude", 6, 5), new C2787d("GPSTimeStamp", 7, 5), new C2787d("GPSSatellites", 8, 2), new C2787d("GPSStatus", 9, 2), new C2787d("GPSMeasureMode", 10, 2), new C2787d("GPSDOP", 11, 5), new C2787d("GPSSpeedRef", 12, 2), new C2787d("GPSSpeed", 13, 5), new C2787d("GPSTrackRef", 14, 2), new C2787d("GPSTrack", 15, 5), new C2787d("GPSImgDirectionRef", 16, 2), new C2787d("GPSImgDirection", 17, 5), new C2787d("GPSMapDatum", 18, 2), new C2787d("GPSDestLatitudeRef", 19, 2), new C2787d("GPSDestLatitude", 20, 5), new C2787d("GPSDestLongitudeRef", 21, 2), new C2787d("GPSDestLongitude", 22, 5), new C2787d("GPSDestBearingRef", 23, 2), new C2787d("GPSDestBearing", 24, 5), new C2787d("GPSDestDistanceRef", 25, 2), new C2787d("GPSDestDistance", 26, 5), new C2787d("GPSProcessingMethod", 27, 7), new C2787d("GPSAreaInformation", 28, 7), new C2787d("GPSDateStamp", 29, 2), new C2787d("GPSDifferential", 30, 3), new C2787d("GPSHPositioningError", 31, 5)};
        C2787d[] c2787dArr4 = {new C2787d("InteroperabilityIndex", 1, 2)};
        C2787d[] c2787dArr5 = {new C2787d("NewSubfileType", 254, 4), new C2787d("SubfileType", 255, 4), new C2787d("ThumbnailImageWidth", 256, 3, 4), new C2787d("ThumbnailImageLength", 257, 3, 4), new C2787d("BitsPerSample", 258, 3), new C2787d("Compression", 259, 3), new C2787d("PhotometricInterpretation", 262, 3), new C2787d("ImageDescription", 270, 2), new C2787d("Make", 271, 2), new C2787d("Model", 272, 2), new C2787d("StripOffsets", 273, 3, 4), new C2787d("ThumbnailOrientation", 274, 3), new C2787d("SamplesPerPixel", 277, 3), new C2787d("RowsPerStrip", 278, 3, 4), new C2787d("StripByteCounts", 279, 3, 4), new C2787d("XResolution", 282, 5), new C2787d("YResolution", 283, 5), new C2787d("PlanarConfiguration", 284, 3), new C2787d("ResolutionUnit", 296, 3), new C2787d("TransferFunction", 301, 3), new C2787d("Software", 305, 2), new C2787d("DateTime", 306, 2), new C2787d("Artist", 315, 2), new C2787d("WhitePoint", 318, 5), new C2787d("PrimaryChromaticities", 319, 5), new C2787d("SubIFDPointer", 330, 4), new C2787d("JPEGInterchangeFormat", 513, 4), new C2787d("JPEGInterchangeFormatLength", 514, 4), new C2787d("YCbCrCoefficients", 529, 5), new C2787d("YCbCrSubSampling", 530, 3), new C2787d("YCbCrPositioning", 531, 3), new C2787d("ReferenceBlackWhite", 532, 5), new C2787d("Copyright", 33432, 2), new C2787d("ExifIFDPointer", 34665, 4), new C2787d("GPSInfoIFDPointer", 34853, 4), new C2787d("DNGVersion", 50706, 1), new C2787d("DefaultCropSize", 50720, 3, 4)};
        f10366E = new C2787d("StripOffsets", 273, 3);
        f10367F = new C2787d[][]{c2787dArr, c2787dArr2, c2787dArr3, c2787dArr4, c2787dArr5, c2787dArr, new C2787d[]{new C2787d("ThumbnailImage", 256, 7), new C2787d("CameraSettingsIFDPointer", 8224, 4), new C2787d("ImageProcessingIFDPointer", 8256, 4)}, new C2787d[]{new C2787d("PreviewImageStart", 257, 4), new C2787d("PreviewImageLength", 258, 4)}, new C2787d[]{new C2787d("AspectFrame", 4371, 3)}, new C2787d[]{new C2787d("ColorSpace", 55, 3)}};
        f10368G = new C2787d[]{new C2787d("SubIFDPointer", 330, 4), new C2787d("ExifIFDPointer", 34665, 4), new C2787d("GPSInfoIFDPointer", 34853, 4), new C2787d("InteroperabilityIFDPointer", 40965, 4), new C2787d("CameraSettingsIFDPointer", 8224, 1), new C2787d("ImageProcessingIFDPointer", 8256, 1)};
        f10369H = new HashMap[10];
        f10370I = new HashMap[10];
        f10371J = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f10372K = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f10373L = charsetForName;
        f10374M = "Exif\u0000\u0000".getBytes(charsetForName);
        f10375N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C2787d[][] c2787dArr6 = f10367F;
            if (i >= c2787dArr6.length) {
                HashMap map = f10372K;
                C2787d[] c2787dArr7 = f10368G;
                map.put(Integer.valueOf(c2787dArr7[0].f10356a), 5);
                map.put(Integer.valueOf(c2787dArr7[1].f10356a), 1);
                map.put(Integer.valueOf(c2787dArr7[2].f10356a), 2);
                map.put(Integer.valueOf(c2787dArr7[3].f10356a), 3);
                map.put(Integer.valueOf(c2787dArr7[4].f10356a), 7);
                map.put(Integer.valueOf(c2787dArr7[5].f10356a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f10369H[i] = new HashMap();
            f10370I[i] = new HashMap();
            for (C2787d c2787d : c2787dArr6[i]) {
                f10369H[i].put(Integer.valueOf(c2787d.f10356a), c2787d);
                f10370I[i].put(c2787d.f10357b, c2787d);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00d8 A[Catch: all -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005e, blocks: (B:14:0x004f, B:16:0x0052, B:23:0x0067, B:29:0x0084, B:31:0x008f, B:39:0x00a5, B:34:0x0096, B:37:0x009e, B:38:0x00a2, B:40:0x00af, B:42:0x00b8, B:44:0x00be, B:46:0x00c4, B:48:0x00ca, B:53:0x00d8), top: B:65:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2790g(InputStream inputStream) throws IOException {
        C2787d[][] c2787dArr = f10367F;
        this.f10394d = new HashMap[c2787dArr.length];
        this.f10395e = new HashSet(c2787dArr.length);
        this.f10396f = ByteOrder.BIG_ENDIAN;
        boolean z7 = inputStream instanceof AssetManager.AssetInputStream;
        boolean z8 = f10376l;
        if (z7) {
            this.f10392b = (AssetManager.AssetInputStream) inputStream;
            this.f10391a = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                AbstractC2791h.m4903c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.f10392b = null;
                this.f10391a = fileInputStream.getFD();
            } catch (Exception unused) {
                if (z8) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
            }
        } else {
            this.f10392b = null;
            this.f10391a = null;
        }
        for (int i = 0; i < c2787dArr.length; i++) {
            try {
                try {
                    this.f10394d[i] = new HashMap();
                } catch (Throwable th) {
                    m4877a();
                    if (z8) {
                        m4893q();
                    }
                    throw th;
                }
            } catch (IOException e) {
                e = e;
                if (z8) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                m4877a();
                if (!z8) {
                    return;
                }
                m4893q();
            } catch (UnsupportedOperationException e8) {
                e = e8;
                if (z8) {
                }
                m4877a();
                if (!z8) {
                }
                m4893q();
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS);
        int iM4883g = m4883g(bufferedInputStream);
        this.f10393c = iM4883g;
        if (iM4883g == 4 || iM4883g == 9 || iM4883g == 13 || iM4883g == 14) {
            C2785b c2785b = new C2785b(bufferedInputStream);
            int i4 = this.f10393c;
            if (i4 == 4) {
                m4882f(c2785b, 0, 0);
            } else if (i4 == 13) {
                m4885i(c2785b);
            } else if (i4 == 9) {
                m4886j(c2785b);
            } else if (i4 == 14) {
                m4889m(c2785b);
            }
        } else {
            C2789f c2789f = new C2789f(bufferedInputStream);
            int i8 = this.f10393c;
            if (i8 == 12) {
                m4881e(c2789f);
            } else if (i8 == 7) {
                m4884h(c2789f);
            } else if (i8 == 10) {
                m4888l(c2789f);
            } else {
                m4887k(c2789f);
            }
            c2789f.m4875c(this.f10398h);
            m4897v(c2789f);
        }
        m4877a();
        if (!z8) {
            return;
        }
        m4893q();
    }

    /* renamed from: r */
    public static ByteOrder m4876r(C2785b c2785b) throws IOException {
        short s8 = c2785b.readShort();
        boolean z7 = f10376l;
        if (s8 == 18761) {
            if (z7) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s8 == 19789) {
            if (z7) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s8));
    }

    /* renamed from: a */
    public final void m4877a() {
        String strM4878b = m4878b("DateTimeOriginal");
        HashMap[] mapArr = this.f10394d;
        if (strM4878b != null && m4878b("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strM4878b.concat("\u0000").getBytes(f10373L);
            map.put("DateTime", new C2786c(bytes, 2, bytes.length));
        }
        if (m4878b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", C2786c.m4868a(0L, this.f10396f));
        }
        if (m4878b("ImageLength") == null) {
            mapArr[0].put("ImageLength", C2786c.m4868a(0L, this.f10396f));
        }
        if (m4878b("Orientation") == null) {
            mapArr[0].put("Orientation", C2786c.m4868a(0L, this.f10396f));
        }
        if (m4878b("LightSource") == null) {
            mapArr[1].put("LightSource", C2786c.m4868a(0L, this.f10396f));
        }
    }

    /* renamed from: b */
    public final String m4878b(String str) {
        C2786c c2786cM4880d = m4880d(str);
        if (c2786cM4880d != null) {
            int i = c2786cM4880d.f10352a;
            if (!f10371J.contains(str)) {
                return c2786cM4880d.m4873f(this.f10396f);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                C2788e[] c2788eArr = (C2788e[]) c2786cM4880d.m4874g(this.f10396f);
                if (c2788eArr == null || c2788eArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(c2788eArr));
                    return null;
                }
                C2788e c2788e = c2788eArr[0];
                Integer numValueOf = Integer.valueOf((int) (c2788e.f10360a / c2788e.f10361b));
                C2788e c2788e2 = c2788eArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (c2788e2.f10360a / c2788e2.f10361b));
                C2788e c2788e3 = c2788eArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (c2788e3.f10360a / c2788e3.f10361b)));
            }
            try {
                return Double.toString(c2786cM4880d.m4871d(this.f10396f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    public final int m4879c() {
        C2786c c2786cM4880d = m4880d("Orientation");
        if (c2786cM4880d == null) {
            return 1;
        }
        try {
            return c2786cM4880d.m4872e(this.f10396f);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    /* renamed from: d */
    public final C2786c m4880d(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f10376l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f10367F.length; i++) {
            C2786c c2786c = (C2786c) this.f10394d[i].get(str);
            if (c2786c != null) {
                return c2786c;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void m4881e(C2789f c2789f) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                AbstractC2792i.m4904a(mediaMetadataRetriever, new C2784a(c2789f));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f10394d;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", C2786c.m4870c(Integer.parseInt(strExtractMetadata), this.f10396f));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", C2786c.m4870c(Integer.parseInt(strExtractMetadata2), this.f10396f));
                }
                if (strExtractMetadata3 != null) {
                    int i = Integer.parseInt(strExtractMetadata3);
                    mapArr[0].put("Orientation", C2786c.m4870c(i != 90 ? i != 180 ? i != 270 ? 1 : 8 : 3 : 6, this.f10396f));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i4 = Integer.parseInt(strExtractMetadata4);
                    int i8 = Integer.parseInt(strExtractMetadata5);
                    if (i8 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c2789f.m4875c(i4);
                    byte[] bArr = new byte[6];
                    c2789f.readFully(bArr);
                    int i9 = i4 + 6;
                    int i10 = i8 - 6;
                    if (!Arrays.equals(bArr, f10374M)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i10];
                    c2789f.readFully(bArr2);
                    this.f10398h = i9;
                    m4894s(bArr2, 0);
                }
                if (f10376l) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0197, code lost:
    
        r23.f10349l = r22.f10396f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x019b, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013e A[SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4882f(C2785b c2785b, int i, int i4) throws Throwable {
        byte[] bArr;
        int i8;
        boolean z7 = f10376l;
        if (z7) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + c2785b);
        }
        c2785b.f10349l = ByteOrder.BIG_ENDIAN;
        byte b7 = c2785b.readByte();
        byte b8 = -1;
        if (b7 != -1) {
            throw new IOException("Invalid marker: " + Integer.toHexString(b7 & 255));
        }
        if (c2785b.readByte() != -40) {
            throw new IOException("Invalid marker: " + Integer.toHexString(b7 & 255));
        }
        int i9 = 2;
        int i10 = 2;
        while (true) {
            byte b9 = c2785b.readByte();
            if (b9 != b8) {
                throw new IOException("Invalid marker:" + Integer.toHexString(b9 & 255));
            }
            byte b10 = c2785b.readByte();
            if (z7) {
                Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(b10 & 255));
            }
            if (b10 != -39 && b10 != -38) {
                int unsignedShort = c2785b.readUnsignedShort();
                int i11 = unsignedShort - 2;
                int i12 = i10 + 4;
                if (z7) {
                    Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(b10 & 255) + " (length: " + unsignedShort + ")");
                }
                if (i11 < 0) {
                    throw new IOException("Invalid length");
                }
                int i13 = 0;
                HashMap[] mapArr = this.f10394d;
                if (b10 == -31) {
                    byte[] bArr2 = new byte[i11];
                    c2785b.readFully(bArr2);
                    int i14 = i12 + i11;
                    byte[] bArr3 = f10374M;
                    if (bArr3 != null && i11 >= bArr3.length) {
                        int i15 = 0;
                        while (i15 < bArr3.length) {
                            if (bArr2[i15] != bArr3[i15]) {
                                bArr = f10375N;
                                if (bArr != null && i11 >= bArr.length) {
                                    i8 = i13;
                                    while (true) {
                                        if (i8 < bArr.length) {
                                            int length = i12 + bArr.length;
                                            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, bArr.length, i11);
                                            if (m4878b("Xmp") == null) {
                                                mapArr[i13].put("Xmp", new C2786c(length, bArrCopyOfRange, 1, bArrCopyOfRange.length));
                                            }
                                        } else if (bArr2[i8] == bArr[i8]) {
                                            i8++;
                                        }
                                    }
                                }
                                i12 = i14;
                                i11 = 0;
                            } else {
                                i15++;
                                i13 = 0;
                            }
                        }
                        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr2, bArr3.length, i11);
                        this.f10398h = i + i12 + bArr3.length;
                        m4894s(bArrCopyOfRange2, i4);
                        m4897v(new C2785b(bArrCopyOfRange2));
                        i12 = i14;
                        i11 = 0;
                    } else {
                        bArr = f10375N;
                        if (bArr != null) {
                            i8 = i13;
                            while (true) {
                                if (i8 < bArr.length) {
                                }
                                i8++;
                            }
                        }
                        i12 = i14;
                        i11 = 0;
                    }
                } else if (b10 != -2) {
                    switch (b10) {
                        case -64:
                        case -63:
                        case -62:
                        case -61:
                            break;
                        default:
                            switch (b10) {
                                case -59:
                                case -58:
                                case -57:
                                    break;
                                default:
                                    switch (b10) {
                                        case -55:
                                        case -54:
                                        case -53:
                                            break;
                                        default:
                                            switch (b10) {
                                            }
                                    }
                            }
                    }
                    c2785b.m4867b(1);
                    mapArr[i4].put(i4 != 4 ? "ImageLength" : "ThumbnailImageLength", C2786c.m4868a(c2785b.readUnsignedShort(), this.f10396f));
                    mapArr[i4].put(i4 != 4 ? "ImageWidth" : "ThumbnailImageWidth", C2786c.m4868a(c2785b.readUnsignedShort(), this.f10396f));
                    i11 = unsignedShort - 7;
                } else {
                    byte[] bArr4 = new byte[i11];
                    c2785b.readFully(bArr4);
                    if (m4878b("UserComment") == null) {
                        HashMap map = mapArr[1];
                        Charset charset = f10373L;
                        byte[] bytes = new String(bArr4, charset).concat("\u0000").getBytes(charset);
                        map.put("UserComment", new C2786c(bytes, i9, bytes.length));
                    }
                    i11 = 0;
                }
                if (i11 < 0) {
                    throw new IOException("Invalid length");
                }
                c2785b.m4867b(i11);
                i10 = i12 + i11;
                i9 = 2;
                b8 = -1;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:169|12|(4:164|13|150|14)|(16:17|(2:19|20)(1:28)|23|29|(1:31)|32|(4:152|35|(7:154|39|40|(3:43|(1:45)(2:46|(1:48))|(1:179)(3:177|51|52))(1:180)|53|36|37)|176)|34|160|65|162|66|67|(1:73)(1:72)|74|(1:87)(8:156|89|158|90|91|(1:93)(1:94)|95|(1:109)(3:111|(2:112|(2:114|(2:171|116)(1:117))(2:170|118))|(1:120)(4:122|(2:123|(2:125|(1:173)(1:128))(3:172|129|(2:130|(1:174)(2:132|(1:175)(1:135)))))|127|(1:137)(1:139)))))|16|160|65|162|66|67|(3:69|73|74)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r9 < 16) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f1, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f4, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00f6, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f8, code lost:
    
        if (r5 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00fa, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fd, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00fe, code lost:
    
        if (r2 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0100, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0103, code lost:
    
        r0 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0107 A[RETURN] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m4883g(BufferedInputStream bufferedInputStream) throws Throwable {
        C2785b c2785b;
        int i;
        C2785b c2785b2;
        int i4;
        C2785b c2785b3;
        C2785b c2785b4;
        int i8;
        int i9;
        C2785b c2785b5;
        long j;
        byte[] bArr;
        long j8;
        bufferedInputStream.mark(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS);
        byte[] bArr2 = new byte[DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i10 = 0;
        while (true) {
            byte[] bArr3 = f10379o;
            if (i10 >= bArr3.length) {
                return 4;
            }
            if (bArr2[i10] != bArr3[i10]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i11 = 0; i11 < bytes.length; i11++) {
                    if (bArr2[i11] != bytes[i11]) {
                        int i12 = 1;
                        try {
                            c2785b2 = new C2785b(bArr2);
                            try {
                                try {
                                    j = c2785b2.readInt();
                                    bArr = new byte[4];
                                    c2785b2.readFully(bArr);
                                } catch (Exception e) {
                                    e = e;
                                    i = 0;
                                }
                            } catch (Throwable th) {
                                th = th;
                                c2785b = c2785b2;
                                if (c2785b != null) {
                                    c2785b.close();
                                }
                                throw th;
                            }
                        } catch (Exception e8) {
                            e = e8;
                            i = 0;
                            c2785b2 = null;
                        } catch (Throwable th2) {
                            th = th2;
                            c2785b = null;
                        }
                        if (Arrays.equals(bArr, f10380p)) {
                            if (j == 1) {
                                j = c2785b2.readLong();
                                j8 = 16;
                            } else {
                                j8 = 8;
                            }
                            i = 0;
                            long j9 = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS;
                            if (j > j9) {
                                j = j9;
                            }
                            long j10 = j - j8;
                            if (j10 >= 8) {
                                try {
                                    byte[] bArr4 = new byte[4];
                                    boolean z7 = false;
                                    boolean z8 = false;
                                    for (long j11 = 0; j11 < j10 / 4; j11++) {
                                        try {
                                            c2785b2.readFully(bArr4);
                                            if (j11 != 1) {
                                                if (Arrays.equals(bArr4, f10381q)) {
                                                    z7 = true;
                                                } else if (Arrays.equals(bArr4, f10382r)) {
                                                    z8 = true;
                                                }
                                                if (z7 && z8) {
                                                    c2785b2.close();
                                                    return 12;
                                                }
                                            }
                                        } catch (EOFException unused) {
                                        }
                                    }
                                } catch (Exception e9) {
                                    e = e9;
                                    if (f10376l) {
                                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                    }
                                    if (c2785b2 != null) {
                                        c2785b2.close();
                                    }
                                    C2785b c2785b6 = new C2785b(bArr2);
                                    ByteOrder byteOrderM4876r = m4876r(c2785b6);
                                    this.f10396f = byteOrderM4876r;
                                    c2785b6.f10349l = byteOrderM4876r;
                                    short s8 = c2785b6.readShort();
                                    if (s8 == 20306) {
                                    }
                                    if (i4 == 0) {
                                    }
                                }
                            }
                            c2785b2.close();
                            C2785b c2785b62 = new C2785b(bArr2);
                            ByteOrder byteOrderM4876r2 = m4876r(c2785b62);
                            this.f10396f = byteOrderM4876r2;
                            c2785b62.f10349l = byteOrderM4876r2;
                            short s82 = c2785b62.readShort();
                            i4 = (s82 == 20306 || s82 == 21330) ? 1 : i;
                            c2785b62.close();
                            if (i4 == 0) {
                                return 7;
                            }
                            try {
                                c2785b5 = new C2785b(bArr2);
                            } catch (Exception unused2) {
                                c2785b4 = null;
                            } catch (Throwable th3) {
                                th = th3;
                                c2785b3 = null;
                            }
                            try {
                                ByteOrder byteOrderM4876r3 = m4876r(c2785b5);
                                this.f10396f = byteOrderM4876r3;
                                c2785b5.f10349l = byteOrderM4876r3;
                                i8 = c2785b5.readShort() == 85 ? 1 : i;
                                c2785b5.close();
                            } catch (Exception unused3) {
                                c2785b4 = c2785b5;
                                if (c2785b4 != null) {
                                    c2785b4.close();
                                }
                                i8 = i;
                                if (i8 == 0) {
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                c2785b3 = c2785b5;
                                if (c2785b3 != null) {
                                    c2785b3.close();
                                }
                                throw th;
                            }
                            if (i8 == 0) {
                                return 10;
                            }
                            int i13 = i;
                            while (true) {
                                byte[] bArr5 = f10385u;
                                if (i13 >= bArr5.length) {
                                    i9 = 1;
                                    break;
                                }
                                if (bArr2[i13] != bArr5[i13]) {
                                    i9 = i;
                                    break;
                                }
                                i13++;
                            }
                            if (i9 != 0) {
                                return 13;
                            }
                            int i14 = i;
                            while (true) {
                                byte[] bArr6 = f10389y;
                                if (i14 >= bArr6.length) {
                                    int i15 = i;
                                    while (true) {
                                        byte[] bArr7 = f10390z;
                                        if (i15 >= bArr7.length) {
                                            break;
                                        }
                                        if (bArr2[bArr6.length + i15 + 4] != bArr7[i15]) {
                                            break;
                                        }
                                        i15++;
                                    }
                                } else {
                                    if (bArr2[i14] != bArr6[i14]) {
                                        break;
                                    }
                                    i14++;
                                }
                            }
                            i12 = i;
                            if (i12 != 0) {
                                return 14;
                            }
                            return i;
                        }
                        c2785b2.close();
                        i = 0;
                        C2785b c2785b622 = new C2785b(bArr2);
                        ByteOrder byteOrderM4876r22 = m4876r(c2785b622);
                        this.f10396f = byteOrderM4876r22;
                        c2785b622.f10349l = byteOrderM4876r22;
                        short s822 = c2785b622.readShort();
                        if (s822 == 20306) {
                            c2785b622.close();
                        }
                        if (i4 == 0) {
                        }
                    }
                }
                return 9;
            }
            i10++;
        }
    }

    /* renamed from: h */
    public final void m4884h(C2789f c2789f) throws Throwable {
        int i;
        int i4;
        m4887k(c2789f);
        HashMap[] mapArr = this.f10394d;
        C2786c c2786c = (C2786c) mapArr[1].get("MakerNote");
        if (c2786c != null) {
            C2789f c2789f2 = new C2789f(c2786c.f10355d);
            c2789f2.f10349l = this.f10396f;
            byte[] bArr = f10383s;
            byte[] bArr2 = new byte[bArr.length];
            c2789f2.readFully(bArr2);
            c2789f2.m4875c(0L);
            byte[] bArr3 = f10384t;
            byte[] bArr4 = new byte[bArr3.length];
            c2789f2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c2789f2.m4875c(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c2789f2.m4875c(12L);
            }
            m4895t(c2789f2, 6);
            C2786c c2786c2 = (C2786c) mapArr[7].get("PreviewImageStart");
            C2786c c2786c3 = (C2786c) mapArr[7].get("PreviewImageLength");
            if (c2786c2 != null && c2786c3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", c2786c2);
                mapArr[5].put("JPEGInterchangeFormatLength", c2786c3);
            }
            C2786c c2786c4 = (C2786c) mapArr[8].get("AspectFrame");
            if (c2786c4 != null) {
                int[] iArr = (int[]) c2786c4.m4874g(this.f10396f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i8 = iArr[2];
                int i9 = iArr[0];
                if (i8 <= i9 || (i = iArr[3]) <= (i4 = iArr[1])) {
                    return;
                }
                int i10 = (i8 - i9) + 1;
                int i11 = (i - i4) + 1;
                if (i10 < i11) {
                    int i12 = i10 + i11;
                    i11 = i12 - i11;
                    i10 = i12 - i11;
                }
                C2786c c2786cM4870c = C2786c.m4870c(i10, this.f10396f);
                C2786c c2786cM4870c2 = C2786c.m4870c(i11, this.f10396f);
                mapArr[0].put("ImageWidth", c2786cM4870c);
                mapArr[0].put("ImageLength", c2786cM4870c2);
            }
        }
    }

    /* renamed from: i */
    public final void m4885i(C2785b c2785b) throws Throwable {
        if (f10376l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c2785b);
        }
        c2785b.f10349l = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f10385u;
        c2785b.m4867b(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = c2785b.readInt();
                byte[] bArr2 = new byte[4];
                c2785b.readFully(bArr2);
                int i4 = length + 8;
                if (i4 == 16 && !Arrays.equals(bArr2, f10387w)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f10388x)) {
                    return;
                }
                if (Arrays.equals(bArr2, f10386v)) {
                    byte[] bArr3 = new byte[i];
                    c2785b.readFully(bArr3);
                    int i8 = c2785b.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i8) {
                        this.f10398h = i4;
                        m4894s(bArr3, 0);
                        m4900y();
                        m4897v(new C2785b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i8 + ", calculated CRC value: " + crc32.getValue());
                }
                int i9 = i + 4;
                c2785b.m4867b(i9);
                length = i4 + i9;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* renamed from: j */
    public final void m4886j(C2785b c2785b) throws Throwable {
        boolean z7 = f10376l;
        if (z7) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + c2785b);
        }
        c2785b.m4867b(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c2785b.readFully(bArr);
        c2785b.readFully(bArr2);
        c2785b.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i4 = ByteBuffer.wrap(bArr2).getInt();
        int i8 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i4];
        c2785b.m4867b(i - c2785b.f10348k);
        c2785b.readFully(bArr4);
        m4882f(new C2785b(bArr4), i, 5);
        c2785b.m4867b(i8 - c2785b.f10348k);
        c2785b.f10349l = ByteOrder.BIG_ENDIAN;
        int i9 = c2785b.readInt();
        if (z7) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i9);
        }
        for (int i10 = 0; i10 < i9; i10++) {
            int unsignedShort = c2785b.readUnsignedShort();
            int unsignedShort2 = c2785b.readUnsignedShort();
            if (unsignedShort == f10366E.f10356a) {
                short s8 = c2785b.readShort();
                short s9 = c2785b.readShort();
                C2786c c2786cM4870c = C2786c.m4870c(s8, this.f10396f);
                C2786c c2786cM4870c2 = C2786c.m4870c(s9, this.f10396f);
                HashMap[] mapArr = this.f10394d;
                mapArr[0].put("ImageLength", c2786cM4870c);
                mapArr[0].put("ImageWidth", c2786cM4870c2);
                if (z7) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s8) + ", width: " + ((int) s9));
                    return;
                }
                return;
            }
            c2785b.m4867b(unsignedShort2);
        }
    }

    /* renamed from: k */
    public final void m4887k(C2789f c2789f) throws Throwable {
        m4892p(c2789f);
        m4895t(c2789f, 0);
        m4899x(c2789f, 0);
        m4899x(c2789f, 5);
        m4899x(c2789f, 4);
        m4900y();
        if (this.f10393c == 8) {
            HashMap[] mapArr = this.f10394d;
            C2786c c2786c = (C2786c) mapArr[1].get("MakerNote");
            if (c2786c != null) {
                C2789f c2789f2 = new C2789f(c2786c.f10355d);
                c2789f2.f10349l = this.f10396f;
                c2789f2.m4867b(6);
                m4895t(c2789f2, 9);
                C2786c c2786c2 = (C2786c) mapArr[9].get("ColorSpace");
                if (c2786c2 != null) {
                    mapArr[1].put("ColorSpace", c2786c2);
                }
            }
        }
    }

    /* renamed from: l */
    public final void m4888l(C2789f c2789f) throws Throwable {
        if (f10376l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + c2789f);
        }
        m4887k(c2789f);
        HashMap[] mapArr = this.f10394d;
        C2786c c2786c = (C2786c) mapArr[0].get("JpgFromRaw");
        if (c2786c != null) {
            m4882f(new C2785b(c2786c.f10355d), (int) c2786c.f10354c, 5);
        }
        C2786c c2786c2 = (C2786c) mapArr[0].get("ISO");
        C2786c c2786c3 = (C2786c) mapArr[1].get("PhotographicSensitivity");
        if (c2786c2 == null || c2786c3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", c2786c2);
    }

    /* renamed from: m */
    public final void m4889m(C2785b c2785b) throws Throwable {
        if (f10376l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c2785b);
        }
        c2785b.f10349l = ByteOrder.LITTLE_ENDIAN;
        c2785b.m4867b(f10389y.length);
        int i = c2785b.readInt() + 8;
        byte[] bArr = f10390z;
        c2785b.m4867b(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                c2785b.readFully(bArr2);
                int i4 = c2785b.readInt();
                int i8 = length + 8;
                if (Arrays.equals(f10362A, bArr2)) {
                    byte[] bArr3 = new byte[i4];
                    c2785b.readFully(bArr3);
                    this.f10398h = i8;
                    m4894s(bArr3, 0);
                    m4897v(new C2785b(bArr3));
                    return;
                }
                if (i4 % 2 == 1) {
                    i4++;
                }
                length = i8 + i4;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                c2785b.m4867b(i4);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* renamed from: n */
    public final void m4890n(C2785b c2785b, HashMap map) throws Throwable {
        C2786c c2786c = (C2786c) map.get("JPEGInterchangeFormat");
        C2786c c2786c2 = (C2786c) map.get("JPEGInterchangeFormatLength");
        if (c2786c == null || c2786c2 == null) {
            return;
        }
        int iM4872e = c2786c.m4872e(this.f10396f);
        int iM4872e2 = c2786c2.m4872e(this.f10396f);
        if (this.f10393c == 7) {
            iM4872e += this.f10399i;
        }
        if (iM4872e > 0 && iM4872e2 > 0 && this.f10392b == null && this.f10391a == null) {
            c2785b.m4867b(iM4872e);
            c2785b.readFully(new byte[iM4872e2]);
        }
        if (f10376l) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iM4872e + ", length: " + iM4872e2);
        }
    }

    /* renamed from: o */
    public final boolean m4891o(HashMap map) {
        C2786c c2786c = (C2786c) map.get("ImageLength");
        C2786c c2786c2 = (C2786c) map.get("ImageWidth");
        if (c2786c == null || c2786c2 == null) {
            return false;
        }
        return c2786c.m4872e(this.f10396f) <= 512 && c2786c2.m4872e(this.f10396f) <= 512;
    }

    /* renamed from: p */
    public final void m4892p(C2789f c2789f) throws IOException {
        ByteOrder byteOrderM4876r = m4876r(c2789f);
        this.f10396f = byteOrderM4876r;
        c2789f.f10349l = byteOrderM4876r;
        int unsignedShort = c2789f.readUnsignedShort();
        int i = this.f10393c;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i4 = c2789f.readInt();
        if (i4 < 8) {
            throw new IOException(AbstractC0008a1.m12h(i4, "Invalid first Ifd offset: "));
        }
        int i8 = i4 - 8;
        if (i8 > 0) {
            c2789f.m4867b(i8);
        }
    }

    /* renamed from: q */
    public final void m4893q() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.f10394d;
            if (i >= mapArr.length) {
                return;
            }
            Log.d("ExifInterface", "The size of tag group[" + i + "]: " + mapArr[i].size());
            for (Map.Entry entry : mapArr[i].entrySet()) {
                C2786c c2786c = (C2786c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + c2786c.toString() + ", tagValue: '" + c2786c.m4873f(this.f10396f) + "'");
            }
            i++;
        }
    }

    /* renamed from: s */
    public final void m4894s(byte[] bArr, int i) throws IOException {
        C2789f c2789f = new C2789f(bArr);
        m4892p(c2789f);
        m4895t(c2789f, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0158  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4895t(C2789f c2789f, int i) throws IOException {
        HashMap[] mapArr;
        HashSet hashSet;
        boolean z7;
        short s8;
        HashMap[] mapArr2;
        long j;
        long j8;
        boolean z8;
        int i4;
        long j9;
        int i8;
        C2787d c2787d;
        HashSet hashSet2;
        int unsignedShort;
        long j10;
        int i9 = i;
        int i10 = c2789f.f10348k;
        int i11 = c2789f.f10351n;
        Integer numValueOf = Integer.valueOf(i10);
        HashSet hashSet3 = this.f10395e;
        hashSet3.add(numValueOf);
        short s9 = c2789f.readShort();
        boolean z9 = f10376l;
        if (z9) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s9));
        }
        if (s9 <= 0) {
            return;
        }
        short s10 = 0;
        while (true) {
            mapArr = this.f10394d;
            if (s10 >= s9) {
                break;
            }
            int unsignedShort2 = c2789f.readUnsignedShort();
            int unsignedShort3 = c2789f.readUnsignedShort();
            int i12 = c2789f.readInt();
            long j11 = c2789f.f10348k + 4;
            short s11 = s9;
            C2787d c2787d2 = (C2787d) f10369H[i9].get(Integer.valueOf(unsignedShort2));
            if (z9) {
                z7 = z9;
                s8 = s10;
                mapArr2 = mapArr;
                hashSet = hashSet3;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i9), Integer.valueOf(unsignedShort2), c2787d2 != null ? c2787d2.f10357b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i12)));
            } else {
                hashSet = hashSet3;
                z7 = z9;
                s8 = s10;
                mapArr2 = mapArr;
            }
            if (c2787d2 != null) {
                if (unsignedShort3 > 0) {
                    if (unsignedShort3 < f10364C.length) {
                        int i13 = c2787d2.f10358c;
                        if (i13 == 7 || unsignedShort3 == 7 || i13 == unsignedShort3 || (i4 = c2787d2.f10359d) == unsignedShort3 || (((i13 == 4 || i4 == 4) && unsignedShort3 == 3) || (((i13 == 9 || i4 == 9) && unsignedShort3 == 8) || ((i13 == 12 || i4 == 12) && unsignedShort3 == 11)))) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = i13;
                            }
                            j = j11;
                            j8 = i12 * r7[unsignedShort3];
                            if (j8 < 0 || j8 > 2147483647L) {
                                if (z7) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i12);
                                }
                                z8 = false;
                                if (z8) {
                                    c2789f.m4875c(j);
                                    hashSet2 = hashSet;
                                } else {
                                    long j12 = j;
                                    if (j8 > 4) {
                                        int i14 = c2789f.readInt();
                                        if (z7) {
                                            i8 = unsignedShort2;
                                            Log.d("ExifInterface", "seek to data offset: " + i14);
                                        } else {
                                            i8 = unsignedShort2;
                                        }
                                        if (this.f10393c != 7) {
                                            c2787d = c2787d2;
                                            j9 = j12;
                                            c2789f.m4875c(i14);
                                        } else {
                                            if ("MakerNote".equals(c2787d2.f10357b)) {
                                                this.f10399i = i14;
                                            } else {
                                                if (i9 == 6 && "ThumbnailImage".equals(c2787d2.f10357b)) {
                                                    this.f10400j = i14;
                                                    this.f10401k = i12;
                                                    C2786c c2786cM4870c = C2786c.m4870c(6, this.f10396f);
                                                    j9 = j12;
                                                    C2786c c2786cM4868a = C2786c.m4868a(this.f10400j, this.f10396f);
                                                    c2787d = c2787d2;
                                                    C2786c c2786cM4868a2 = C2786c.m4868a(this.f10401k, this.f10396f);
                                                    mapArr2[4].put("Compression", c2786cM4870c);
                                                    mapArr2[4].put("JPEGInterchangeFormat", c2786cM4868a);
                                                    mapArr2[4].put("JPEGInterchangeFormatLength", c2786cM4868a2);
                                                }
                                                c2789f.m4875c(i14);
                                            }
                                            c2787d = c2787d2;
                                            j9 = j12;
                                            c2789f.m4875c(i14);
                                        }
                                    } else {
                                        j9 = j12;
                                        i8 = unsignedShort2;
                                        c2787d = c2787d2;
                                    }
                                    Integer num = (Integer) f10372K.get(Integer.valueOf(i8));
                                    if (z7) {
                                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j8);
                                    }
                                    if (num != null) {
                                        if (unsignedShort3 != 3) {
                                            if (unsignedShort3 == 4) {
                                                j10 = c2789f.readInt() & 4294967295L;
                                            } else if (unsignedShort3 == 8) {
                                                unsignedShort = c2789f.readShort();
                                            } else if (unsignedShort3 == 9 || unsignedShort3 == 13) {
                                                unsignedShort = c2789f.readInt();
                                            } else {
                                                j10 = -1;
                                            }
                                            if (z7) {
                                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j10), c2787d.f10357b));
                                            }
                                            if (j10 > 0 || (i11 != -1 && j10 >= i11)) {
                                                hashSet2 = hashSet;
                                                if (z7) {
                                                    String strM15k = AbstractC0008a1.m15k("Skip jump into the IFD since its offset is invalid: ", j10);
                                                    if (i11 != -1) {
                                                        strM15k = strM15k + " (total length: " + i11 + ")";
                                                    }
                                                    Log.d("ExifInterface", strM15k);
                                                }
                                            } else {
                                                hashSet2 = hashSet;
                                                if (!hashSet2.contains(Integer.valueOf((int) j10))) {
                                                    c2789f.m4875c(j10);
                                                    m4895t(c2789f, num.intValue());
                                                } else if (z7) {
                                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j10 + ")");
                                                }
                                            }
                                            c2789f.m4875c(j9);
                                        } else {
                                            unsignedShort = c2789f.readUnsignedShort();
                                        }
                                        j10 = unsignedShort;
                                        if (z7) {
                                        }
                                        if (j10 > 0) {
                                            hashSet2 = hashSet;
                                            if (z7) {
                                            }
                                            c2789f.m4875c(j9);
                                        }
                                    } else {
                                        hashSet2 = hashSet;
                                        long j13 = j9;
                                        int i15 = c2789f.f10348k + this.f10398h;
                                        byte[] bArr = new byte[(int) j8];
                                        c2789f.readFully(bArr);
                                        C2786c c2786c = new C2786c(i15, bArr, unsignedShort3, i12);
                                        HashMap map = mapArr2[i];
                                        String str = c2787d.f10357b;
                                        map.put(str, c2786c);
                                        if ("DNGVersion".equals(str)) {
                                            this.f10393c = 3;
                                        }
                                        if ((("Make".equals(str) || "Model".equals(str)) && c2786c.m4873f(this.f10396f).contains("PENTAX")) || ("Compression".equals(str) && c2786c.m4872e(this.f10396f) == 65535)) {
                                            this.f10393c = 8;
                                        }
                                        if (c2789f.f10348k != j13) {
                                            c2789f.m4875c(j13);
                                        }
                                    }
                                }
                                s10 = (short) (s8 + 1);
                                i9 = i;
                                hashSet3 = hashSet2;
                                s9 = s11;
                                z9 = z7;
                            } else {
                                z8 = true;
                                if (z8) {
                                }
                                s10 = (short) (s8 + 1);
                                i9 = i;
                                hashSet3 = hashSet2;
                                s9 = s11;
                                z9 = z7;
                            }
                        } else if (z7) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f10363B[unsignedShort3] + ") is unexpected for tag: " + c2787d2.f10357b);
                        }
                    }
                }
                j = j11;
                if (z7) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j8 = 0;
                z8 = false;
                if (z8) {
                }
                s10 = (short) (s8 + 1);
                i9 = i;
                hashSet3 = hashSet2;
                s9 = s11;
                z9 = z7;
            } else if (z7) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            j = j11;
            j8 = 0;
            z8 = false;
            if (z8) {
            }
            s10 = (short) (s8 + 1);
            i9 = i;
            hashSet3 = hashSet2;
            s9 = s11;
            z9 = z7;
        }
        HashSet hashSet4 = hashSet3;
        boolean z10 = z9;
        int i16 = c2789f.readInt();
        if (z10) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i16)));
        }
        long j14 = i16;
        if (j14 <= 0) {
            if (z10) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i16);
                return;
            }
            return;
        }
        if (hashSet4.contains(Integer.valueOf(i16))) {
            if (z10) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i16);
                return;
            }
            return;
        }
        c2789f.m4875c(j14);
        if (mapArr[4].isEmpty()) {
            m4895t(c2789f, 4);
        } else if (mapArr[5].isEmpty()) {
            m4895t(c2789f, 5);
        }
    }

    /* renamed from: u */
    public final void m4896u(String str, int i, String str2) {
        HashMap[] mapArr = this.f10394d;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, map.get(str));
        mapArr[i].remove(str);
    }

    /* renamed from: v */
    public final void m4897v(C2785b c2785b) throws Throwable {
        C2786c c2786c;
        int iM4872e;
        HashMap map = this.f10394d[4];
        C2786c c2786c2 = (C2786c) map.get("Compression");
        if (c2786c2 == null) {
            m4890n(c2785b, map);
            return;
        }
        int iM4872e2 = c2786c2.m4872e(this.f10396f);
        if (iM4872e2 != 1) {
            if (iM4872e2 == 6) {
                m4890n(c2785b, map);
                return;
            } else if (iM4872e2 != 7) {
                return;
            }
        }
        C2786c c2786c3 = (C2786c) map.get("BitsPerSample");
        if (c2786c3 != null) {
            int[] iArr = (int[]) c2786c3.m4874g(this.f10396f);
            int[] iArr2 = f10377m;
            if (Arrays.equals(iArr2, iArr) || (this.f10393c == 3 && (c2786c = (C2786c) map.get("PhotometricInterpretation")) != null && (((iM4872e = c2786c.m4872e(this.f10396f)) == 1 && Arrays.equals(iArr, f10378n)) || (iM4872e == 6 && Arrays.equals(iArr, iArr2))))) {
                C2786c c2786c4 = (C2786c) map.get("StripOffsets");
                C2786c c2786c5 = (C2786c) map.get("StripByteCounts");
                if (c2786c4 == null || c2786c5 == null) {
                    return;
                }
                long[] jArrM4267h = AbstractC2415i0.m4267h(c2786c4.m4874g(this.f10396f));
                long[] jArrM4267h2 = AbstractC2415i0.m4267h(c2786c5.m4874g(this.f10396f));
                if (jArrM4267h == null || jArrM4267h.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrM4267h2 == null || jArrM4267h2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrM4267h.length != jArrM4267h2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j8 : jArrM4267h2) {
                    j += j8;
                }
                byte[] bArr = new byte[(int) j];
                this.f10397g = true;
                int i = 0;
                int i4 = 0;
                for (int i8 = 0; i8 < jArrM4267h.length; i8++) {
                    int i9 = (int) jArrM4267h[i8];
                    int i10 = (int) jArrM4267h2[i8];
                    if (i8 < jArrM4267h.length - 1 && i9 + i10 != jArrM4267h[i8 + 1]) {
                        this.f10397g = false;
                    }
                    int i11 = i9 - i;
                    if (i11 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        c2785b.m4867b(i11);
                        int i12 = i + i11;
                        byte[] bArr2 = new byte[i10];
                        try {
                            c2785b.readFully(bArr2);
                            i = i12 + i10;
                            System.arraycopy(bArr2, 0, bArr, i4, i10);
                            i4 += i10;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i10 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i11 + " bytes.");
                        return;
                    }
                }
                if (this.f10397g) {
                    long j9 = jArrM4267h[0];
                    return;
                }
                return;
            }
        }
        if (f10376l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    /* renamed from: w */
    public final void m4898w(int i, int i4) throws Throwable {
        HashMap[] mapArr = this.f10394d;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z7 = f10376l;
        if (zIsEmpty || mapArr[i4].isEmpty()) {
            if (z7) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        C2786c c2786c = (C2786c) mapArr[i].get("ImageLength");
        C2786c c2786c2 = (C2786c) mapArr[i].get("ImageWidth");
        C2786c c2786c3 = (C2786c) mapArr[i4].get("ImageLength");
        C2786c c2786c4 = (C2786c) mapArr[i4].get("ImageWidth");
        if (c2786c == null || c2786c2 == null) {
            if (z7) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (c2786c3 == null || c2786c4 == null) {
            if (z7) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iM4872e = c2786c.m4872e(this.f10396f);
        int iM4872e2 = c2786c2.m4872e(this.f10396f);
        int iM4872e3 = c2786c3.m4872e(this.f10396f);
        int iM4872e4 = c2786c4.m4872e(this.f10396f);
        if (iM4872e >= iM4872e3 || iM4872e2 >= iM4872e4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i4];
        mapArr[i4] = map;
    }

    /* renamed from: x */
    public final void m4899x(C2789f c2789f, int i) throws Throwable {
        C2786c c2786cM4870c;
        C2786c c2786cM4870c2;
        HashMap[] mapArr = this.f10394d;
        C2786c c2786c = (C2786c) mapArr[i].get("DefaultCropSize");
        C2786c c2786c2 = (C2786c) mapArr[i].get("SensorTopBorder");
        C2786c c2786c3 = (C2786c) mapArr[i].get("SensorLeftBorder");
        C2786c c2786c4 = (C2786c) mapArr[i].get("SensorBottomBorder");
        C2786c c2786c5 = (C2786c) mapArr[i].get("SensorRightBorder");
        if (c2786c != null) {
            if (c2786c.f10352a == 5) {
                C2788e[] c2788eArr = (C2788e[]) c2786c.m4874g(this.f10396f);
                if (c2788eArr == null || c2788eArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(c2788eArr));
                    return;
                }
                c2786cM4870c = C2786c.m4869b(c2788eArr[0], this.f10396f);
                c2786cM4870c2 = C2786c.m4869b(c2788eArr[1], this.f10396f);
            } else {
                int[] iArr = (int[]) c2786c.m4874g(this.f10396f);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c2786cM4870c = C2786c.m4870c(iArr[0], this.f10396f);
                c2786cM4870c2 = C2786c.m4870c(iArr[1], this.f10396f);
            }
            mapArr[i].put("ImageWidth", c2786cM4870c);
            mapArr[i].put("ImageLength", c2786cM4870c2);
            return;
        }
        if (c2786c2 != null && c2786c3 != null && c2786c4 != null && c2786c5 != null) {
            int iM4872e = c2786c2.m4872e(this.f10396f);
            int iM4872e2 = c2786c4.m4872e(this.f10396f);
            int iM4872e3 = c2786c5.m4872e(this.f10396f);
            int iM4872e4 = c2786c3.m4872e(this.f10396f);
            if (iM4872e2 <= iM4872e || iM4872e3 <= iM4872e4) {
                return;
            }
            C2786c c2786cM4870c3 = C2786c.m4870c(iM4872e2 - iM4872e, this.f10396f);
            C2786c c2786cM4870c4 = C2786c.m4870c(iM4872e3 - iM4872e4, this.f10396f);
            mapArr[i].put("ImageLength", c2786cM4870c3);
            mapArr[i].put("ImageWidth", c2786cM4870c4);
            return;
        }
        C2786c c2786c6 = (C2786c) mapArr[i].get("ImageLength");
        C2786c c2786c7 = (C2786c) mapArr[i].get("ImageWidth");
        if (c2786c6 == null || c2786c7 == null) {
            C2786c c2786c8 = (C2786c) mapArr[i].get("JPEGInterchangeFormat");
            C2786c c2786c9 = (C2786c) mapArr[i].get("JPEGInterchangeFormatLength");
            if (c2786c8 == null || c2786c9 == null) {
                return;
            }
            int iM4872e5 = c2786c8.m4872e(this.f10396f);
            int iM4872e6 = c2786c8.m4872e(this.f10396f);
            c2789f.m4875c(iM4872e5);
            byte[] bArr = new byte[iM4872e6];
            c2789f.readFully(bArr);
            m4882f(new C2785b(bArr), iM4872e5, i);
        }
    }

    /* renamed from: y */
    public final void m4900y() throws Throwable {
        m4898w(0, 5);
        m4898w(0, 4);
        m4898w(5, 4);
        HashMap[] mapArr = this.f10394d;
        C2786c c2786c = (C2786c) mapArr[1].get("PixelXDimension");
        C2786c c2786c2 = (C2786c) mapArr[1].get("PixelYDimension");
        if (c2786c != null && c2786c2 != null) {
            mapArr[0].put("ImageWidth", c2786c);
            mapArr[0].put("ImageLength", c2786c2);
        }
        if (mapArr[4].isEmpty() && m4891o(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!m4891o(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        m4896u("ThumbnailOrientation", 0, "Orientation");
        m4896u("ThumbnailImageLength", 0, "ImageLength");
        m4896u("ThumbnailImageWidth", 0, "ImageWidth");
        m4896u("ThumbnailOrientation", 5, "Orientation");
        m4896u("ThumbnailImageLength", 5, "ImageLength");
        m4896u("ThumbnailImageWidth", 5, "ImageWidth");
        m4896u("Orientation", 4, "ThumbnailOrientation");
        m4896u("ImageLength", 4, "ThumbnailImageLength");
        m4896u("ImageWidth", 4, "ThumbnailImageWidth");
    }
}
